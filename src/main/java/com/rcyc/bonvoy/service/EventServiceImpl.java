package com.rcyc.bonvoy.service;

import com.rcyc.bonvoy.dto.resco.*;
import com.rcyc.bonvoy.model.BonvoyCodeMaster;
import com.rcyc.bonvoy.model.BonvoyMain;
import com.rcyc.bonvoy.repository.BonvoyCodeMasterRepository;
import com.rcyc.bonvoy.repository.BonvoyMainRepository;
import com.rcyc.bonvoy.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    ExecutorService execService;

    @Autowired
    RescoService rescoService;

    @Autowired
    BonvoyMainRepository bonvoyMainRepository;

    @Autowired
    BonvoyCodeMasterRepository bonvoyCodeMasterRepository;

    @Override
    public void getBookingDetailsFromVoyage() throws Exception {
        System.out.println("StartTime: " + new Date());
        ResListEvent resListEvent = rescoService.getAllEvents();
        EventList eventList = resListEvent.getEventList();
        execService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        System.out.println("No of processors: " + Runtime.getRuntime().availableProcessors());
        for (ResEvent resEvent : eventList.getEvent()) {
            execService.execute(new EventProcessRunnable(resEvent.getEventId(), resEvent.getCode()));
        }
    }

    class EventProcessRunnable implements Runnable {
        String eventId;
        String eventCode;

        public EventProcessRunnable(String eventId, String eventCode) {
            this.eventId = eventId;
            this.eventCode = eventCode;
        }

        public void run() {
            try {
                ResInfoFolio resInfoFolio = rescoService.getAllFolios(eventId);
                ResInfoBooking resInfoBooking = rescoService.getAllBookings(eventId);
                List<Folio> folioList = resInfoFolio.getFolioList().getFolio();
                if (folioList != null) {
                    Map<String, Folio> folioMap = folioList.stream().collect(Collectors.toMap(Folio::getFolioId, folio -> folio));
                    BookingList bookingList = resInfoBooking.getBookingList();
                    for (Booking booking : bookingList.getBooking()) {
                        execService.execute(new BookingProcessRunnable(booking, folioMap, eventId, eventCode));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Event process end time: " + new Date());
            }
        }
    }

    class BookingProcessRunnable implements Runnable {
        Booking booking;
        Map<String, Folio> folioMap;
        String eventId;
        String eventCode;


        public BookingProcessRunnable(Booking booking, Map<String, Folio> folioMap, String eventId, String eventCode) {
            this.booking = booking;
            this.folioMap = folioMap;
            this.eventCode = eventCode;
            this.eventId = eventId;
        }

        public void run() {
            try {
                ResInfoBookingDetail resInfoBookingDetail = rescoService.getBookingDetails(booking.getBookingId());
                ResBooking bookingData = resInfoBookingDetail.getBooking();
                List<Traveler> travelerList = bookingData.getTravelerList().getTraveler();
                for (Traveler traveler : travelerList) {
                    List<Transaction> transactionList = traveler.getTransactionList().getTransaction();
                    for (Transaction transaction : transactionList) {
                        if (transaction.getDepartmentType().equalsIgnoreCase("DD")) {
                            ResListSurcharge surchargeResult = rescoService.getSurcharges(booking.getAgency().getAgentId(), transaction.getTripId(), traveler.getTravelerId());
                            List<Surcharge> surchargeList = surchargeResult.getSurchargeList().getSurcharge();
                            for (Surcharge surcharge : surchargeList) {
                                BonvoyCodeMaster bonvoyCode = bonvoyCodeMasterRepository.findByCode(surcharge.getCode()).orElse(null);
                                if (bonvoyCode != null) {
                                    Folio folio = folioMap.get(traveler.getFolioId());
                                    BonvoyMain mainModel = new BonvoyMain();
                                    mainModel.setBookingId(Long.parseLong(bookingData.getBookingId()));
                                    mainModel.setBookingCode(bookingData.getCode());
                                    mainModel.setVoyageId(Long.parseLong(eventId));
                                    mainModel.setVoyageCode(eventCode);
                                    mainModel.setBonvoyCodeMaster(bonvoyCode);
                                    mainModel.setFolioId(Long.parseLong(traveler.getFolioId()));
                                    mainModel.setForename(traveler.getFolio().getForename());
                                    mainModel.setSurname(traveler.getFolio().getSurname());
                                    mainModel.setBonvoyNo(folio.getRepeaterNo());
                                    mainModel.setCreatedDate(LocalDateTime.now());
                                    mainModel.setStatus(Constants.BonvoyStatus.NEW_STATUS);
                                    mainModel.setActive(true);
                                    saveAndFlush(mainModel);
                                }
                            }
                        }
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Booking process end time: " + new Date());
            }
        }
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    public void saveAndFlush(BonvoyMain mainModel) throws Exception {
        bonvoyMainRepository.saveAndFlush(mainModel);
    }
}

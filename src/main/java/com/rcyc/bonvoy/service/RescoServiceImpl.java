package com.rcyc.bonvoy.service;

import com.rcyc.bonvoy.dto.resco.*;
import com.rcyc.bonvoy.utils.Constants;
import com.rcyc.bonvoy.utils.EnvironmentConstants;
import com.rcyc.bonvoy.utils.RescoAPICall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RescoServiceImpl implements RescoService {

    @Autowired
    RescoAPICall rescoAPICall;

    @Override
    public ResListEvent getAllEvents() throws Exception {
        ResListEvent resListEvent = new ResListEvent();
        System.out.println(EnvironmentConstants.RESCO_URL);
        User user = new User(EnvironmentConstants.RESCO_NAME, EnvironmentConstants.RESCO_PASSWORD);
        ReqListEvent reqListEvent = new ReqListEvent();
        reqListEvent.setUser(user);
        Facility facility = new Facility();
        facility.setType("O");
        reqListEvent.setFacility(facility);
        ReqEvent event = new ReqEvent();
        event.setDisabled("0");
        reqListEvent.setReqEvent(event);
        resListEvent = (ResListEvent) rescoAPICall.executeRescoAPI(reqListEvent, new Class[]{ReqListEvent.class,
                User.class, ReqEvent.class, Facility.class, Object.class}, ResListEvent.class);

        return resListEvent;
    }

    @Override
    public ResInfoBooking getAllBookings(String eventId) throws Exception {
        ResInfoBooking resInfoBooking = new ResInfoBooking();
        System.out.println(EnvironmentConstants.RESCO_URL);
        User user = new User(EnvironmentConstants.RESCO_NAME, EnvironmentConstants.RESCO_PASSWORD);
        ReqInfoBooking reqInfoBooking = new ReqInfoBooking();
        Booking reqBooking = new Booking();
        reqBooking.setModifyDate("2007-02-18T00:00:00");
        ReqEvent event = new ReqEvent();
        event.setEventId(eventId);
        event.setDisabled("0");
//        Folio folio = new Folio();
//        Booking bk = new Booking();
//        bk.setCancelled("0");
//        Agency agency = new Agency();
//        bk.setAgency(agency);
//        reqInfoBooking.setFolio(folio);
        reqInfoBooking.setReqEvent(event);
        reqInfoBooking.setUser(user);
        reqInfoBooking.setBooking(reqBooking);
        resInfoBooking = (ResInfoBooking) rescoAPICall.executeRescoAPI(reqInfoBooking, new Class[]{
                        ReqInfoBooking.class, ReqEvent.class, User.class, Folio.class, FolioList.class, Agency.class, Trip.class},
                ResInfoBooking.class);

        return resInfoBooking;
    }

    @Override
    public ResInfoFolio getAllFolios(String eventId) throws Exception {
        ResInfoFolio resInfoFolio = new ResInfoFolio();
        System.out.println(EnvironmentConstants.RESCO_URL);
        User user = new User(EnvironmentConstants.RESCO_NAME, EnvironmentConstants.RESCO_PASSWORD);
        ReqInfoFolio reqInfoFolio = new ReqInfoFolio();

        ReqEvent event = new ReqEvent();
        event.setEventId(eventId);
        event.setDisabled("0");
//        Folio folio = new Folio();
//        Booking bk = new Booking();
//        bk.setCancelled("0");
//        Agency agency = new Agency();
//        bk.setAgency(agency);
//        reqInfoBooking.setFolio(folio);
        reqInfoFolio.setReqEvent(event);
        reqInfoFolio.setUser(user);
        resInfoFolio = (ResInfoFolio) rescoAPICall.executeRescoAPI(reqInfoFolio, new Class[]{
                        ReqInfoFolio.class, ReqEvent.class, User.class, Folio.class, BookingDTO.class, Object.class},
                ResInfoFolio.class);

        return resInfoFolio;
    }

    @Override
    public ResInfoBookingDetail getBookingDetails(String bookingId) throws Exception {
        System.out.println(EnvironmentConstants.RESCO_URL);
        User user = new User(EnvironmentConstants.RESCO_NAME, EnvironmentConstants.RESCO_PASSWORD);

        BookingDetail bookingDetail = new BookingDetail(bookingId, Constants.TRIP_INCLUDE_STATUS,
                Constants.TOUR_INCLUDE_STATUS, Constants.BOOKING_INCLUDE_STATUS, Constants.TRANSACTION_INCLUDE_STATUS);
        bookingDetail.setPersonal("1");

        ReqInfoBookingDetail reqInfoBookingDetail = new ReqInfoBookingDetail(user, bookingDetail);

        ResInfoBookingDetail resInfoBookingDetail = (ResInfoBookingDetail) rescoAPICall.executeRescoAPI(
                reqInfoBookingDetail, new Class[]{ReqInfoBookingDetail.class, User.class, BookingDetail.class},
                ResInfoBookingDetail.class);

        return resInfoBookingDetail;
    }

    @Override
    public ResListSurcharge getSurcharges(String agentId, String tripId, String travellerId) throws Exception {
        System.out.println(EnvironmentConstants.RESCO_URL);
        User user = new User(EnvironmentConstants.RESCO_NAME, EnvironmentConstants.RESCO_PASSWORD);

        Agency agency = new Agency(agentId);
        Surcharge surcharge = new Surcharge(tripId, travellerId);

        ReqListSurcharge reqListSurcharge = new ReqListSurcharge(user, agency, surcharge);

        ResListSurcharge resListSurcharge = (ResListSurcharge) rescoAPICall.executeRescoAPI(
                reqListSurcharge, new Class[]{ReqListSurcharge.class, User.class, Agency.class, Surcharge.class, Object.class},
                ResListSurcharge.class);

        return resListSurcharge;
    }


}

package com.rcyc.bonvoy.service;

import com.rcyc.bonvoy.dto.resco.*;
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
    public ResInfoBooking getAllBookings() throws Exception {
        ResInfoBooking resInfoBooking = new ResInfoBooking();
        System.out.println(EnvironmentConstants.RESCO_URL);
        User user = new User(EnvironmentConstants.RESCO_NAME, EnvironmentConstants.RESCO_PASSWORD);
        ReqInfoBooking reqInfoBooking = new ReqInfoBooking();

        Folio folio = new Folio();
        Booking bk = new Booking();
        bk.setCancelled("0");
        Agency agency = new Agency();
        bk.setAgency(agency);
        reqInfoBooking.setFolio(folio);
        reqInfoBooking.setBooking(bk);
        reqInfoBooking.setUser(user);
        resInfoBooking = (ResInfoBooking) rescoAPICall.executeRescoAPI(reqInfoBooking, new Class[]{
                        ReqInfoBooking.class, User.class, Folio.class, FolioList.class, Agency.class, Trip.class},
                ResInfoBooking.class);

        return resInfoBooking;
    }
}

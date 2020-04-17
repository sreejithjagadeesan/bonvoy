package com.rcyc.bonvoy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    RescoService rescoService;

    @Override
    public void getBookingDetailsFromVoyage() throws Exception {

    }
}

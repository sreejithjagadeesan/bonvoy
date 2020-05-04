package com.rcyc.bonvoy.controller;

import com.rcyc.bonvoy.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "event")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping
    public void getBookingDetailsFromVoyage() {
        try {
            System.out.println("Strated executing controller method...");
            eventService.getBookingDetailsFromVoyage();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

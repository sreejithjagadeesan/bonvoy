package com.rcyc.bonvoy.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestRescoServiceImpl {

    @Autowired
    RescoService rescoService;

    @Test
    void getAllEvents() {
        try {
            rescoService.getAllEvents();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Test
    void getAllBookings() {
        try {
            rescoService.getAllBookings();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
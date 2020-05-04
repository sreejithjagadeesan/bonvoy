package com.rcyc.bonvoy.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
            rescoService.getAllBookings("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //    @Test
    void getAllFolios() {
        try {
            rescoService.getAllFolios("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package com.rcyc.bonvoy.utils;

import com.rcyc.bonvoy.controller.EventController;
import com.rcyc.bonvoy.model.SchedulerHistory;
import com.rcyc.bonvoy.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduledTasks {

    @Autowired
    EventController eventController;

    @Autowired
    SchedulerService schedulerService;

    @Scheduled(fixedDelayString = "300000", initialDelayString = "5000")
    public void scheduledTasks() {
        try {
            SchedulerHistory lastRanObj = schedulerService.getLastSuccessfulRun().orElse(null);
            LocalDateTime nextRanTime = lastRanObj != null ? lastRanObj.getStartTime().plusMinutes(1440l) : null;

            if (nextRanTime != null && nextRanTime.isAfter(LocalDateTime.now())) {
                System.out.println("Method executed..");
                eventController.getBookingDetailsFromVoyage();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

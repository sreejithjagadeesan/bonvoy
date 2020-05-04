package com.rcyc.bonvoy.service;

import com.rcyc.bonvoy.model.SchedulerHistory;
import com.rcyc.bonvoy.repository.SchedulerHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SchedulerServiceImpl implements SchedulerService {

    @Autowired
    SchedulerHistoryRepository schedulerHistoryRepository;

    @Override
    public Optional<SchedulerHistory> getLastSuccessfulRun() throws Exception{
        return schedulerHistoryRepository.findTopByOrderByIdDesc();
    }
}

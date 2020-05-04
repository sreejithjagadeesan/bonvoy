package com.rcyc.bonvoy.service;

import com.rcyc.bonvoy.model.SchedulerHistory;

import java.util.Optional;

public interface SchedulerService {

    public Optional<SchedulerHistory> getLastSuccessfulRun() throws Exception;
}

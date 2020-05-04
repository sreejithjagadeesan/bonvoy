package com.rcyc.bonvoy.repository;

import com.rcyc.bonvoy.model.SchedulerHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchedulerHistoryRepository extends JpaRepository<SchedulerHistory, Long> {

    Optional<SchedulerHistory> findTopByOrderByIdDesc();
}

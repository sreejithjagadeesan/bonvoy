package com.rcyc.bonvoy.model;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class SchedulerHistory {

    private Long id;
    private LocalDateTime startTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}

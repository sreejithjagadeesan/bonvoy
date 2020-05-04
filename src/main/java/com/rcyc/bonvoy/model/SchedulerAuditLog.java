package com.rcyc.bonvoy.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class SchedulerAuditLog {

    private Long id;
    @ManyToOne
    private SchedulerHistory scheduler;
    private Long eventId;
    private Long bookingId;
    private LocalDateTime createdDate;
    private LocalDateTime bookingModifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SchedulerHistory getScheduler() {
        return scheduler;
    }

    public void setScheduler(SchedulerHistory scheduler) {
        this.scheduler = scheduler;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getBookingModifiedTime() {
        return bookingModifiedTime;
    }

    public void setBookingModifiedTime(LocalDateTime bookingModifiedTime) {
        this.bookingModifiedTime = bookingModifiedTime;
    }
}

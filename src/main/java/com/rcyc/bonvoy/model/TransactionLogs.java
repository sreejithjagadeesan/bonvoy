package com.rcyc.bonvoy.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TransactionLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @ManyToOne
    private BonvoyMain bonvoyMain;
    private String currentStatus;
    private String prevStatus;
    private String remarks;
    private String res1;
    private String res2;
    private LocalDateTime updatedDate;
    @ManyToOne
    private User updatedBy;

    public TransactionLogs() {
    }

    public TransactionLogs(BonvoyMain bonvoyMain, String prevStatus, User updatedBy) {
        this.bonvoyMain = bonvoyMain;
        this.prevStatus = prevStatus;
        this.updatedBy = updatedBy;
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public BonvoyMain getBonvoyMain() {
        return bonvoyMain;
    }

    public void setBonvoyMain(BonvoyMain bonvoyMain) {
        this.bonvoyMain = bonvoyMain;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getPrevStatus() {
        return prevStatus;
    }

    public void setPrevStatus(String prevStatus) {
        this.prevStatus = prevStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRes1() {
        return res1;
    }

    public void setRes1(String res1) {
        this.res1 = res1;
    }

    public String getRes2() {
        return res2;
    }

    public void setRes2(String res2) {
        this.res2 = res2;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }
}

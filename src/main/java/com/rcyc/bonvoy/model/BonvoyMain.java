package com.rcyc.bonvoy.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class BonvoyMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long bookingId;
    private Long voyageId;
    private Long folioId;
    private String bookingCode;
    private String voyageCode;
    private String forename;
    private String surname;
    private String bonvoyNo;
    @ManyToOne
    private BonvoyCodeMaster bonvoyCodeMaster;
    private String certificateNo;
    private String status;
    private String res1;
    private String res2;
    private String res3;
    private String res4;
    private String res5;
    private LocalDateTime createdDate;
    private LocalDateTime certificateIssuedDate;
    @ManyToOne
    private User createdBy;
    private LocalDateTime updatedDate;
    @ManyToOne
    private User updatedBy;
    private boolean isActive;
    private String notes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getVoyageId() {
        return voyageId;
    }

    public void setVoyageId(Long voyageId) {
        this.voyageId = voyageId;
    }

    public Long getFolioId() {
        return folioId;
    }

    public void setFolioId(Long folioId) {
        this.folioId = folioId;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getVoyageCode() {
        return voyageCode;
    }

    public void setVoyageCode(String voyageCode) {
        this.voyageCode = voyageCode;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBonvoyNo() {
        return bonvoyNo;
    }

    public void setBonvoyNo(String bonvoyNo) {
        this.bonvoyNo = bonvoyNo;
    }

    public BonvoyCodeMaster getBonvoyCodeMaster() {
        return bonvoyCodeMaster;
    }

    public void setBonvoyCodeMaster(BonvoyCodeMaster bonvoyCodeMaster) {
        this.bonvoyCodeMaster = bonvoyCodeMaster;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getRes3() {
        return res3;
    }

    public void setRes3(String res3) {
        this.res3 = res3;
    }

    public String getRes4() {
        return res4;
    }

    public void setRes4(String res4) {
        this.res4 = res4;
    }

    public String getRes5() {
        return res5;
    }

    public void setRes5(String res5) {
        this.res5 = res5;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getCertificateIssuedDate() {
        return certificateIssuedDate;
    }

    public void setCertificateIssuedDate(LocalDateTime certificateIssuedDate) {
        this.certificateIssuedDate = certificateIssuedDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

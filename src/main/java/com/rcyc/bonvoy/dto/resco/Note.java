package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class Note {

    private String BookingId;

    private String EventId;

    private String PriorAssignId;

    private String TemplateId;

    private String NoteType;

    private String Comments;

    private String TemplateCode;

    private String Voided;

    private NoteItemList NoteItemList;

    private String AssignId;

    @XmlElement(name = "BookingId")
    public String getBookingId() {
        return BookingId;
    }

    public void setBookingId(String bookingId) {
        BookingId = bookingId;
    }

    @XmlElement(name = "EventId")
    public String getEventId() {
        return EventId;
    }

    public void setEventId(String eventId) {
        EventId = eventId;
    }

    @XmlElement(name = "PriorAssignId")
    public String getPriorAssignId() {
        return PriorAssignId;
    }

    public void setPriorAssignId(String priorAssignId) {
        PriorAssignId = priorAssignId;
    }

    @XmlElement(name = "TemplateId")
    public String getTemplateId() {
        return TemplateId;
    }

    public void setTemplateId(String templateId) {
        TemplateId = templateId;
    }

    @XmlElement(name = "NoteType")
    public String getNoteType() {
        return NoteType;
    }

    public void setNoteType(String noteType) {
        NoteType = noteType;
    }

    @XmlElement(name = "Comments")
    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    @XmlElement(name = "TemplateCode")
    public String getTemplateCode() {
        return TemplateCode;
    }

    public void setTemplateCode(String templateCode) {
        TemplateCode = templateCode;
    }

    @XmlElement(name = "Voided")
    public String getVoided() {
        return Voided;
    }

    public void setVoided(String voided) {
        Voided = voided;
    }

    @XmlElement(name = "NoteItemList")
    public NoteItemList getNoteItemList() {
        return NoteItemList;
    }

    public void setNoteItemList(NoteItemList noteItemList) {
        NoteItemList = noteItemList;
    }

    @XmlElement(name = "AssignId")
    public String getAssignId() {
        return AssignId;
    }

    public void setAssignId(String assignId) {
        AssignId = assignId;
    }

    @Override
    public String toString() {
        return "ClassPojo [BookingId = " + BookingId + ", EventId = " + EventId + ", PriorAssignId = " + PriorAssignId
                + ", TemplateId = " + TemplateId + ", NoteType = " + NoteType + ", Comments = " + Comments + "]";

    }
}


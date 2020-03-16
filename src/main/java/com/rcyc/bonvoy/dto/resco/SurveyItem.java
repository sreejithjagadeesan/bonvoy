package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class SurveyItem {
    @XmlElement(name = "ItemId")
    private Integer ItemId;

    @XmlElement(name = "BookingId")
    private String BookingId;

    @XmlElement(name = "EventId")
    private String EventId;

    @XmlElement(name = "Code")
    private String Code;

    @XmlElement(name = "Name")
    private String Name;

    @XmlElement(name = "BaseMessage")
    private String BaseMessage;

    @XmlElement(name = "FlexDate01")
    private String FlexDate01;

    public Integer getItemId() {
        return ItemId;
    }

    public void setItemId(Integer itemId) {
        ItemId = itemId;
    }


    public String getBookingId() {
        return BookingId;
    }

    public void setBookingId(String bookingId) {
        BookingId = bookingId;
    }

    public String getEventId() {
        return EventId;
    }

    public void setEventId(String eventId) {
        EventId = eventId;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBaseMessage() {
        return BaseMessage;
    }

    public void setBaseMessage(String baseMessage) {
        BaseMessage = baseMessage;
    }

    public String getFlexDate01() {
        return FlexDate01;
    }

    public void setFlexDate01(String flexDate01) {
        FlexDate01 = flexDate01;
    }
}

package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class ResEvent {

    private String eventId;
    private String code;

    public ResEvent() {
    }

    @XmlElement(name = "EventId")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @XmlElement(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}


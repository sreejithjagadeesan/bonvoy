package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class ReqEvent {

    private String eventId;
    private String disabled;

    public ReqEvent() {
    }

    @XmlElement(name = "EventId")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @XmlElement(name = "Disabled")
    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }
}


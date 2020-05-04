package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class EventList {

    private List<ResEvent> event;

    public EventList() {
    }

    @XmlElement(name = "Event")
    public List<ResEvent> getEvent() {
        return event;
    }

    public void setEvent(List<ResEvent> event) {
        this.event = event;
    }
}

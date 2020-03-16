package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResListEvent")
public class ResListEvent {

    private Result Result;

    private EventList eventList;

    public ResListEvent() {
    }

    @XmlElement(name = "Result")
    public com.rcyc.bonvoy.dto.resco.Result getResult() {
        return Result;
    }

    public void setResult(com.rcyc.bonvoy.dto.resco.Result result) {
        Result = result;
    }

    @XmlElement(name = "EventList")
    public EventList getEventList() {
        return eventList;
    }

    public void setEventList(EventList eventList) {
        this.eventList = eventList;
    }
}

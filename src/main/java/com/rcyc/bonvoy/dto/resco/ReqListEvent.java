package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ReqListEvent")
public class ReqListEvent {

    private User User;

    private ReqEvent reqEvent;

    private Facility facility;


    public ReqListEvent() {
    }

    @XmlElement(name = "User")
    public com.rcyc.bonvoy.dto.resco.User getUser() {
        return User;
    }

    public void setUser(com.rcyc.bonvoy.dto.resco.User user) {
        User = user;
    }

    @XmlElement(name = "Event")
    public ReqEvent getReqEvent() {
        return reqEvent;
    }

    public void setReqEvent(ReqEvent reqEvent) {
        this.reqEvent = reqEvent;
    }

    @XmlElement(name = "Facility")
    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}

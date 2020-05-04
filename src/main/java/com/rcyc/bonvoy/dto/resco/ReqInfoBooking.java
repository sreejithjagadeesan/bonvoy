package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author sreejithjn
 */
@XmlRootElement(name = "ReqInfoBooking")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqInfoBooking {

    @XmlElement(name = "User")
    private User user;

    @XmlElement(name = "Folio")
    private Folio folio;

    @XmlElement(name = "Event")
    private ReqEvent reqEvent;

    @XmlElement(name = "Booking")
    public Booking booking;

    /**
     * @return the booking
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * @param booking the booking to set
     */
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the folio
     */
    public Folio getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(Folio folio) {
        this.folio = folio;
    }

    public ReqEvent getReqEvent() {
        return reqEvent;
    }

    public void setReqEvent(ReqEvent reqEvent) {
        this.reqEvent = reqEvent;
    }

    /**
     *
     */
    public ReqInfoBooking() {
        super();
    }

    /**
     * @param user
     * @param folio
     */
    public ReqInfoBooking(User user, Folio folio) {
        super();
        this.user = user;
        this.folio = folio;
    }

    /**
     * @param user
     */
    public ReqInfoBooking(User user) {
        super();
        this.user = user;
    }

    /**
     * @param folio
     */
    public ReqInfoBooking(Folio folio) {
        super();
        this.folio = folio;
    }

    public ReqInfoBooking(String agentId, String agencyId, String cancelStatus) {
        super();
        Booking bk = new Booking();
        bk.setCancelled(cancelStatus);
        bk.setAgentId(agentId);
        bk.setAgencyId(agencyId);
        this.booking = bk;

    }

}

/**
 *
 */
package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sreejithjn
 *
 */
@XmlRootElement(name = "ReqInfoFolio")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqInfoFolio {

    @XmlElement(name = "User")
    private User user;

    @XmlElement(name = "Folio")
    private Folio folio;

    @XmlElement(name = "Event")
    private ReqEvent reqEvent;

    @XmlElement(name = "Booking")
    private BookingDTO booking;

    /**
     * @return the booking
     */

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Folio getFolio() {
        return folio;
    }

    public void setFolio(Folio folio) {
        this.folio = folio;
    }

    public ReqEvent getReqEvent() {
        return reqEvent;
    }

    public void setReqEvent(ReqEvent reqEvent) {
        this.reqEvent = reqEvent;
    }

    public BookingDTO getBooking() {
        return booking;
    }

    public void setBooking(BookingDTO booking) {
        this.booking = booking;
    }
}
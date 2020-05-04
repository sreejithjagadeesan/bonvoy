package com.rcyc.bonvoy.dto.resco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;


public class BookingList {
    @XmlElement
    ArrayList<Booking> Booking = new ArrayList<Booking>();
    private int totalcount;

    /**
     * @return the booking
     */

    public ArrayList<Booking> getBooking() {
        return Booking;
    }

    /**
     * @param booking the booking to set
     */
    public void setBooking(ArrayList<Booking> booking) {
        Booking = booking;
    }

    /**
     * @return the totalcount
     */
    public int getTotalcount() {
        return totalcount;
    }

    /**
     * @param totalcount the totalcount to set
     */
    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;
    }


}

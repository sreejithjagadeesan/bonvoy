package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ResInfoBooking")
public class ResInfoBooking {
    Result ResultObject;
    BookingList BookingListObject;


    // Getter Methods
    @XmlElement(name = "Result")
    public Result getResult() {
        return ResultObject;
    }

    @XmlElement(name = "BookingList")
    public BookingList getBookingList() {
        return BookingListObject;
    }

    // Setter Methods

    public void setResult(Result ResultObject) {
        this.ResultObject = ResultObject;
    }

    public void setBookingList(BookingList BookingListObject) {
        this.BookingListObject = BookingListObject;
    }
}

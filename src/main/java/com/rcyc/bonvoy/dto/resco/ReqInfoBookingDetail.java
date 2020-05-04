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
@XmlRootElement(name = "ReqInfoBookingDetail")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqInfoBookingDetail {

	@XmlElement(name="User") 
	private User User;
	@XmlElement(name="Booking") 
	public BookingDetail Booking;
	@XmlElement(name="Booking") 
	public Booking HotelBooking;
	
	

	/**
	 * @return the booking
	 */
	
	public BookingDetail getBooking() {
		return Booking;
	}

	/**
	 * @param booking the booking to set
	 */
	public void setBooking(BookingDetail booking) {
		this.Booking = booking;
	}

	/**
	 * @return the user
	 */

	public User getUser() {
		return User;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.User = user;
	}

	/**
	 * @param user
	 * @param booking
	 */
	public ReqInfoBookingDetail(User user, BookingDetail booking) {
		super();
		this.User = user;
		this.Booking = booking;
	}

	public ReqInfoBookingDetail(com.rcyc.bonvoy.dto.resco.Booking hotelBooking) {
		super();
		HotelBooking = hotelBooking;
	}

	/**
	 * 
	 */
	public ReqInfoBookingDetail() {
		super();
	}

	public Booking getHotelBooking() {
		return HotelBooking;
	}

	public void setHotelBooking(Booking hotelBooking) {
		HotelBooking = hotelBooking;
	}

	public ReqInfoBookingDetail(BookingDetail booking) {
		super();
		Booking = booking;
	}
	
	

	

}
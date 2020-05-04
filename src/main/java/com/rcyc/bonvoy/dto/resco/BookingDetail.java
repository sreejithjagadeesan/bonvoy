package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class BookingDetail {
	private String bookingId;

	private String trip;

	private String tour;

	private String booking;

	private String transaction;

	private String transfer;

	private String personal;

	@XmlElement(name = "BookingId")
	public String getBookingId() {
		return this.bookingId;
	}

	/**
	 * @return the trip
	 */
	@XmlElement(name = "Trip")
	public String getTrip() {
		return trip;
	}

	/**
	 * @param trip the trip to set
	 */
	public void setTrip(String trip) {
		this.trip = trip;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @param bookingId
	 * @param trip
	 */

	public BookingDetail(String bookingId, String trip) {
		super();
		this.bookingId = bookingId;
		this.trip = trip;
	}

	public BookingDetail(String bookingId) {
		super();
		this.bookingId = bookingId;
	}

	/**
	 * @param bookingId
	 * @param trip
	 * @param tour
	 * @param booking
	 */
	public BookingDetail(String bookingId, String trip, String tour, String booking, String transaction) {
		super();
		this.bookingId = bookingId;
		this.trip = trip;
		this.tour = tour;
		this.transaction = transaction;
		this.booking = booking;
	}

	/**
	 * 
	 */
	public BookingDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tour
	 */
	@XmlElement(name = "Tour")
	public String getTour() {
		return tour;
	}

	/**
	 * @param tour the tour to set
	 */
	public void setTour(String tour) {
		this.tour = tour;
	}

	/**
	 * @return the booking
	 */
	@XmlElement(name = "Booking")
	public String getBooking() {
		return booking;
	}

	/**
	 * @param booking the booking to set
	 */
	public void setBooking(String booking) {
		this.booking = booking;
	}

	@XmlElement(name = "Transaction")
	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	@XmlElement(name = "Transfer")
	public String getTransfer() {
		return transfer;
	}

	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}

	@XmlElement(name = "Personal")
	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

}
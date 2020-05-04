package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class BookingDTO {
	private String Code;
	private String bookingId;

	public BookingDTO() {
		// TODO Auto-generated constructor stub
	}

	public BookingDTO(String code) {
		super();
		Code = code;
	}

	/**
	 * @return the code
	 */
	@XmlElement(name = "Code")
	public String getCode() {
		return Code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		Code = code;
	}

	@XmlElement(name = "BookingId")
	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

}

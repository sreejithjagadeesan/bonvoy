package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class ResBooking {
	
	private String BookStatus;

    private String BillingId;

    private String FirstItemBegDate;

    private String CreatedUserId;

    private String BookingId;

    private String BookDate;

    private String FirstTripBegDate;

    private TravelerList TravelerList;

    private String LastItemEndDate;

    private String Code;

    private String LastTripEndDate;

	/**
	 * @return the bookStatus
	 */
    @XmlElement(name="BookStatus") 
	public String getBookStatus() {
		return BookStatus;
	}

	/**
	 * @param bookStatus the bookStatus to set
	 */
	public void setBookStatus(String bookStatus) {
		BookStatus = bookStatus;
	}

	/**
	 * @return the billingId
	 */
	@XmlElement(name="BillingId") 
	public String getBillingId() {
		return BillingId;
	}

	/**
	 * @param billingId the billingId to set
	 */
	public void setBillingId(String billingId) {
		BillingId = billingId;
	}

	/**
	 * @return the firstItemBegDate
	 */
	@XmlElement(name="FirstItemBegDate") 
	public String getFirstItemBegDate() {
		return FirstItemBegDate;
	}

	/**
	 * @param firstItemBegDate the firstItemBegDate to set
	 */
	public void setFirstItemBegDate(String firstItemBegDate) {
		FirstItemBegDate = firstItemBegDate;
	}

	/**
	 * @return the createdUserId
	 */
	@XmlElement(name="CreatedUserId") 
	public String getCreatedUserId() {
		return CreatedUserId;
	}

	/**
	 * @param createdUserId the createdUserId to set
	 */
	public void setCreatedUserId(String createdUserId) {
		CreatedUserId = createdUserId;
	}

	/**
	 * @return the bookingId
	 */
	@XmlElement(name="BookingId") 
	public String getBookingId() {
		return BookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(String bookingId) {
		BookingId = bookingId;
	}

	/**
	 * @return the bookDate
	 */
	@XmlElement(name="BookDate") 
	public String getBookDate() {
		return BookDate;
	}

	/**
	 * @param bookDate the bookDate to set
	 */
	public void setBookDate(String bookDate) {
		BookDate = bookDate;
	}

	/**
	 * @return the firstTripBegDate
	 */
	@XmlElement(name="FirstTripBegDate") 
	public String getFirstTripBegDate() {
		return FirstTripBegDate;
	}

	/**
	 * @param firstTripBegDate the firstTripBegDate to set
	 */
	public void setFirstTripBegDate(String firstTripBegDate) {
		FirstTripBegDate = firstTripBegDate;
	}

	/**
	 * @return the travelerList
	 */
	@XmlElement(name="TravelerList") 
	public TravelerList getTravelerList() {
		return TravelerList;
	}

	/**
	 * @param travelerList the travelerList to set
	 */
	public void setTravelerList(TravelerList travelerList) {
		TravelerList = travelerList;
	}

	/**
	 * @return the lastItemEndDate
	 */
	@XmlElement(name="LastItemEndDate") 
	public String getLastItemEndDate() {
		return LastItemEndDate;
	}

	/**
	 * @param lastItemEndDate the lastItemEndDate to set
	 */
	public void setLastItemEndDate(String lastItemEndDate) {
		LastItemEndDate = lastItemEndDate;
	}

	/**
	 * @return the code
	 */
	@XmlElement(name="Code") 
	public String getCode() {
		return Code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		Code = code;
	}

	/**
	 * @return the lastTripEndDate
	 */
	@XmlElement(name="LastTripEndDate") 
	public String getLastTripEndDate() {
		return LastTripEndDate;
	}

	/**
	 * @param lastTripEndDate the lastTripEndDate to set
	 */
	public void setLastTripEndDate(String lastTripEndDate) {
		LastTripEndDate = lastTripEndDate;
	}

	@Override
	public String toString() {
		return "ResBooking [BookStatus=" + BookStatus + ", BillingId=" + BillingId + ", FirstItemBegDate="
				+ FirstItemBegDate + ", CreatedUserId=" + CreatedUserId + ", BookingId=" + BookingId + ", BookDate="
				+ BookDate + ", FirstTripBegDate=" + FirstTripBegDate + ", TravelerList=" + TravelerList
				+ ", LastItemEndDate=" + LastItemEndDate + ", Code=" + Code + ", LastTripEndDate=" + LastTripEndDate
				+ "]";
	}
    
    



	

	}

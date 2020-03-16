package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class Trip {
    private String TripId;
    private String FacilityCode;
    private String EventId;
    private String EventCode;
    private String BegDate;
    private String EndDate;
    private String CategoryCode;
    private String PriceId;
    private String PriceCode;
    private String UnitNo;
    private String BegLocation;
    private String EndLocation;
    private String BegLocationName;
    private String EndLocationName;
    private String Primary;
    private String Amount;
    private Integer bookingId;
    private Integer pnrId;

    // Getter Methods
    @XmlElement(name = "TripId")
    public String getTripId() {
        return TripId;
    }

    @XmlElement(name = "FacilityCode")
    public String getFacilityCode() {
        return FacilityCode;
    }

    @XmlElement(name = "EventId")
    public String getEventId() {
        return EventId;
    }

    @XmlElement(name = "EventCode")
    public String getEventCode() {
        return EventCode;
    }

    @XmlElement(name = "BegDate")
    public String getBegDate() {
        return BegDate;
    }

    @XmlElement(name = "EndDate")
    public String getEndDate() {
        return EndDate;
    }

    @XmlElement(name = "CategoryCode")
    public String getCategoryCode() {
        return CategoryCode;
    }

    @XmlElement(name = "PriceId")
    public String getPriceId() {
        return PriceId;
    }

    @XmlElement(name = "PriceCode")
    public String getPriceCode() {
        return PriceCode;
    }

    @XmlElement(name = "UnitNo")
    public String getUnitNo() {
        return UnitNo;
    }

    // Setter Methods

    public void setTripId(String TripId) {
        this.TripId = TripId;
    }

    public void setFacilityCode(String FacilityCode) {
        this.FacilityCode = FacilityCode;
    }

    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    public void setBegDate(String BegDate) {
        this.BegDate = BegDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public void setCategoryCode(String CategoryCode) {
        this.CategoryCode = CategoryCode;
    }

    public void setPriceId(String PriceId) {
        this.PriceId = PriceId;
    }

    public void setPriceCode(String PriceCode) {
        this.PriceCode = PriceCode;
    }

    public void setUnitNo(String UnitNo) {
        this.UnitNo = UnitNo;
    }

    /**
     * @return the begLocation
     */

    @XmlElement(name = "BegLocation")
    public String getBegLocation() {
        return BegLocation;
    }

    /**
     * @param begLocation the begLocation to set
     */
    public void setBegLocation(String begLocation) {
        this.BegLocation = begLocation;
    }

    /**
     * @return the endLocation
     */
    @XmlElement(name = "EndLocation")
    public String getEndLocation() {
        return EndLocation;
    }

    /**
     * @param endLocation the endLocation to set
     */
    public void setEndLocation(String endLocation) {
        this.EndLocation = endLocation;
    }

    /**
     * @return the begLocationName
     */
    public String getBegLocationName() {
        return BegLocationName;
    }

    /**
     * @param begLocationName the begLocationName to set
     */
    public void setBegLocationName(String begLocationName) {
        BegLocationName = begLocationName;
    }

    /**
     * @return the endLocationName
     */
    public String getEndLocationName() {
        return EndLocationName;
    }

    /**
     * @param endLocationName the endLocationName to set
     */
    public void setEndLocationName(String endLocationName) {
        EndLocationName = endLocationName;
    }

    /**
     * @return the primary
     */
    @XmlElement(name = "Primary")
    public String getPrimary() {
        return Primary;
    }

    /**
     * @param primary the primary to set
     */
    public void setPrimary(String primary) {
        Primary = primary;
    }

    /**
     * @return the amount
     */
    @XmlElement(name = "Amount")
    public String getAmount() {
        return Amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        Amount = amount;
    }

    @XmlElement(name = "BookingId")
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    @XmlElement(name = "PnrId")
    public Integer getPnrId() {
        return pnrId;
    }

    public void setPnrId(Integer pnrId) {
        this.pnrId = pnrId;
    }


}

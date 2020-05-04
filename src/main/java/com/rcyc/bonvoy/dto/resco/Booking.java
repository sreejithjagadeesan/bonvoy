package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class Booking {
    private String bookingId;
    private String billingId;
    private String primaryId;
    private String guestForeName;
    private String guestMiddleName;
    private String guestSurname;
    private String guestGreeting;
    private String guestGender;
    private String createdUserId;
    private String code;
    private String bookDate;
    private String firstTripBegDate;
    private String lastTripEndDate;
    private String bookStatus;
    private String payStatus;
    private String bookingType;
    private String originType;
    private String modifyDate;
    private String cancelled;
    private Integer nights;
    private Agency agencyObject;
    private Trip tripObject;

    private String personal;
    private String document;
    private String tour;
    private String hotel;
    private String transfer;
    private String giftOrder;
    private String dining;
    private String insurance;
    private String voidedTraveler;
    private String tripString;
    private Boolean isRequiredDataMissing;
    private String agentId;
    private String agencyId;


    @XmlElement(name = "AgentId")
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    @XmlElement(name = "BookingId")
    public String getBookingId() {
        return this.bookingId;
    }

    @XmlElement(name = "BillingId")
    public String getBillingId() {
        return this.billingId;
    }

    @XmlElement(name = "PrimaryId")
    public String getPrimaryId() {
        return this.primaryId;
    }

    @XmlElement(name = "CreatedUserId")
    public String getCreatedUserId() {
        return this.createdUserId;
    }

    @XmlElement(name = "Code")
    public String getCode() {
        return this.code;
    }

    @XmlElement(name = "BookDate")
    public String getBookDate() {
        return this.bookDate;
    }

    @XmlElement(name = "FirstTripBegDate")
    public String getFirstTripBegDate() {
        return this.firstTripBegDate;
    }

    @XmlElement(name = "LastTripEndDate")
    public String getLastTripEndDate() {
        return this.lastTripEndDate;
    }

    @XmlElement(name = "BookStatus")
    public String getBookStatus() {
        return this.bookStatus;
    }

    @XmlElement(name = "PayStatus")
    public String getPayStatus() {
        return this.payStatus;
    }

    @XmlElement(name = "BookingType")
    public String getBookingType() {
        return this.bookingType;
    }

    @XmlElement(name = "OriginType")
    public String getOriginType() {
        return this.originType;
    }

    @XmlElement(name = "ModifyDate")
    public String getModifyDate() {
        return this.modifyDate;
    }

    @XmlElement(name = "Agency")
    public Agency getAgency() {
        return this.agencyObject;
    }

    @XmlElement(name = "Trip")
    public Trip getTrip() {
        return this.tripObject;
    }

    @XmlElement(name = "Cancelled")
    public String getCancelled() {
        return this.cancelled;
    }

    // Setter Methods

    public void setBookingId(String BookingId) {
        this.bookingId = BookingId;
    }

    public void setBillingId(String BillingId) {
        this.billingId = BillingId;
    }

    public void setPrimaryId(String PrimaryId) {
        this.primaryId = PrimaryId;
    }

    public void setCreatedUserId(String CreatedUserId) {
        this.createdUserId = CreatedUserId;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public void setBookDate(String BookDate) {
        this.bookDate = BookDate;
    }

    public void setFirstTripBegDate(String FirstTripBegDate) {
        this.firstTripBegDate = FirstTripBegDate;
    }

    public void setLastTripEndDate(String LastTripEndDate) {
        this.lastTripEndDate = LastTripEndDate;
    }

    public void setBookStatus(String BookStatus) {
        this.bookStatus = BookStatus;
    }

    public void setPayStatus(String PayStatus) {
        this.payStatus = PayStatus;
    }

    public void setBookingType(String BookingType) {
        this.bookingType = BookingType;
    }

    public void setOriginType(String OriginType) {
        this.originType = OriginType;
    }

    public void setModifyDate(String ModifyDate) {
        this.modifyDate = ModifyDate;
    }

    public void setAgency(Agency AgencyObject) {
        this.agencyObject = AgencyObject;
    }

    public void setTrip(Trip TripObject) {
        this.tripObject = TripObject;
    }


    /**
     * @param cancelled the cancelled to set
     */
    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @return the nights
     */
    public Integer getNights() {
        return nights;
    }

    /**
     * @param nights the nights to set
     */
    public void setNights(Integer nights) {
        this.nights = nights;
    }

    /**
     * @return the guestForeName
     */
    public String getGuestForeName() {
        return guestForeName;
    }

    /**
     * @param guestForeName the guestForeName to set
     */
    public void setGuestForeName(String guestForeName) {
        this.guestForeName = guestForeName;
    }

    /**
     * @return the guestMiddleName
     */
    public String getGuestMiddleName() {
        return guestMiddleName;
    }

    /**
     * @param guestMiddleName the guestMiddleName to set
     */
    public void setGuestMiddleName(String guestMiddleName) {
        this.guestMiddleName = guestMiddleName;
    }


    /**
     * @return the guestGender
     */
    public String getGuestGender() {
        return guestGender;
    }

    /**
     * @param guestGender the guestGender to set
     */
    public void setGuestGender(String guestGender) {
        this.guestGender = guestGender;
    }

    /**
     * @return the guestGreeting
     */
    public String getGuestGreeting() {
        return guestGreeting;
    }

    /**
     * @param guestGreeting the guestGreeting to set
     */
    public void setGuestGreeting(String guestGreeting) {
        this.guestGreeting = guestGreeting;
    }

    /**
     * @return the guestSurname
     */
    public String getGuestSurname() {
        return guestSurname;
    }

    /**
     * @param guestSurname the guestSurname to set
     */
    public void setGuestSurname(String guestSurname) {
        this.guestSurname = guestSurname;
    }


    @XmlElement(name = "Personal")
    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    @XmlElement(name = "Document")
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @XmlElement(name = "Tour")
    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    @XmlElement(name = "Hotel")
    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    @XmlElement(name = "GiftOrder")
    public String getGiftOrder() {
        return giftOrder;
    }

    public void setGiftOrder(String giftOrder) {
        this.giftOrder = giftOrder;
    }

    @XmlElement(name = "Dining")
    public String getDining() {
        return dining;
    }

    public void setDining(String dining) {
        this.dining = dining;
    }

    @XmlElement(name = "Insurance")
    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    @XmlElement(name = "VoidedTraveler")
    public String getVoidedTraveler() {
        return voidedTraveler;
    }

    public void setVoidedTraveler(String voidedTraveler) {
        this.voidedTraveler = voidedTraveler;
    }

    @XmlElement(name = "Transfer")
    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    @XmlElement(name = "Trip")
    public String getTripString() {
        return tripString;
    }

    public void setTripString(String tripString) {
        this.tripString = tripString;
    }

    public Boolean getIsRequiredDataMissing() {
        return isRequiredDataMissing;
    }

    public void setIsRequiredDataMissing(Boolean isRequiredDataMissing) {
        this.isRequiredDataMissing = isRequiredDataMissing;
    }

    @XmlElement(name = "AgencyId")
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }


}

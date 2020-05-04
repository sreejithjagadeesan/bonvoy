package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class Surcharge {

    private String TripId;
    private String TravelerId;
    private String SurchargeId;
    private String Code;
    private String Name;
    private String DepartmentCode;
    private String DepartmentType;
    private String Required;
    private String Manual;
    private String Selected;
    private String Amount;

    public Surcharge() {
    }

    public Surcharge(String tripId, String travelerId) {
        TripId = tripId;
        TravelerId = travelerId;
    }

    @XmlElement(name = "TripId")
    public String getTripId() {
        return TripId;
    }

    public void setTripId(String tripId) {
        TripId = tripId;
    }

    @XmlElement(name = "TravelerId")
    public String getTravelerId() {
        return TravelerId;
    }

    public void setTravelerId(String travelerId) {
        TravelerId = travelerId;
    }

    @XmlElement(name = "SurchargeId")
    public String getSurchargeId() {
        return SurchargeId;
    }

    public void setSurchargeId(String surchargeId) {
        SurchargeId = surchargeId;
    }

    @XmlElement(name = "Code")
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @XmlElement(name = "DepartmentCode")
    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    @XmlElement(name = "DepartmentType")
    public String getDepartmentType() {
        return DepartmentType;
    }

    public void setDepartmentType(String departmentType) {
        DepartmentType = departmentType;
    }

    @XmlElement(name = "Required")
    public String getRequired() {
        return Required;
    }

    public void setRequired(String required) {
        Required = required;
    }

    @XmlElement(name = "Manual")
    public String getManual() {
        return Manual;
    }

    public void setManual(String manual) {
        Manual = manual;
    }

    @XmlElement(name = "Selected")
    public String getSelected() {
        return Selected;
    }

    public void setSelected(String selected) {
        Selected = selected;
    }

    @XmlElement(name = "Amount")
    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }
}

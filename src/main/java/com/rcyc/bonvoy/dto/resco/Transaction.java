package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class Transaction {
	
	
	private String  transactionId;
	
	
	private String  tripId;
	
	
	private String departmentId;
	
	
	private String departmentType;
	
	
	private String date;
	
	
	private String status;
	
	
	private String amount;
	
	
	private String baseMessage;


	@XmlElement(name="TransactionId")
	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@XmlElement(name="TripId")
	public String getTripId() {
		return tripId;
	}


	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	@XmlElement(name="DepartmentId")
	public String getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	@XmlElement(name="DepartmentType")
	public String getDepartmentType() {
		return departmentType;
	}


	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}

	@XmlElement(name="Date")
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	@XmlElement(name="Status")
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement(name="Amount")
	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}

	@XmlElement(name="BaseMessage")
	public String getBaseMessage() {
		return baseMessage;
	}


	public void setBaseMessage(String baseMessage) {
		this.baseMessage = baseMessage;
	}
	
	
	
	

}

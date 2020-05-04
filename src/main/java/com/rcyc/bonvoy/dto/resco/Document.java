package com.rcyc.bonvoy.dto.resco;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class Document {


    private String externalId;
    private Integer DocumentId;
    private String type;
    private String no;
    private String surName;
    private String foreName;
    private String midName;
    private String issueDate;
    private String IssueCountry;
    private String expiryDate;


    @XmlElement(name = "ExternalId")
    public String getExternalId() {
        return externalId;
    }


    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }


    @XmlElement(name = "DocumentId")
    public Integer getDocumentId() {
        return DocumentId;
    }


    public void setDocumentId(Integer documentId) {
        DocumentId = documentId;
    }




	/*@XmlElement(name = "ExternalId")
	public String getExternalId() {
		return externalId;
	}



	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}*/


    @XmlElement(name = "Type")
    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "No")
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @XmlElement(name = "Surname")
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @XmlElement(name = "Forename")
    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    @XmlElement(name = "Midname")
    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    @XmlElement(name = "IssueDate")
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @XmlElement(name = "IssueCountry")
    public String getIssueCountry() {
        return IssueCountry;
    }

    public void setIssueCountry(String issueCountry) {
        IssueCountry = issueCountry;
    }

    @XmlElement(name = "ExpiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    @Override
    public String toString() {
        return "Document [externalId=" + externalId + ", DocumentId=" + DocumentId + ", type=" + type + ", no=" + no
                + ", surName=" + surName + ", foreName=" + foreName + ", midName=" + midName + ", issueDate="
                + issueDate + ", IssueCountry=" + IssueCountry + ", expiryDate=" + expiryDate + "]";
    }


}

package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;


public class Survey {
    private String Code;

    private String ValidOnDate;

    private Integer Items;


    private Integer Options;

    private Integer Disabled;

    private Integer SurveyId;

    private String Name;

    private String Scope;

    private String Type;

    private String QuestionType;

    private String BaseMessage;

    private SurveyItemList SurveyItemList;


    @XmlElement(name = "Code")
    public String getCode() {
        return Code;
    }


    public void setCode(String code) {
        Code = code;
    }

    @XmlElement(name = "ValidOnDate")
    public String getValidOnDate() {
        return ValidOnDate;
    }


    public void setValidOnDate(String validOnDate) {
        ValidOnDate = validOnDate;
    }

    @XmlElement(name = "Items")
    public Integer getItems() {
        return Items;
    }


    public void setItems(Integer items) {
        Items = items;
    }

    @XmlElement(name = "Options")
    public Integer getOptions() {
        return Options;
    }


    public void setOptions(Integer options) {
        Options = options;
    }

    @XmlElement(name = "Disabled")
    public Integer getDisabled() {
        return Disabled;
    }


    public void setDisabled(Integer disabled) {
        Disabled = disabled;
    }


    public Integer getSurveyId() {
        return SurveyId;
    }


    public void setSurveyId(Integer surveyId) {
        SurveyId = surveyId;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }

    @XmlElement(name = "Scope")
    public String getScope() {
        return Scope;
    }


    public void setScope(String scope) {
        Scope = scope;
    }

    @XmlElement(name = "Type")
    public String getType() {
        return Type;
    }


    public void setType(String type) {
        Type = type;
    }

    @XmlElement(name = "QuestionType")
    public String getQuestionType() {
        return QuestionType;
    }


    public void setQuestionType(String questionType) {
        QuestionType = questionType;
    }

    @XmlElement(name = "BaseMessage")
    public String getBaseMessage() {
        return BaseMessage;
    }


    public void setBaseMessage(String baseMessage) {
        BaseMessage = baseMessage;
    }

    @XmlElement(name = "SurveyItemList")
    public SurveyItemList getSurveyItemList() {
        return SurveyItemList;
    }


    public void setSurveyItemList(SurveyItemList surveyItemList) {
        SurveyItemList = surveyItemList;
    }


    @Override
    public String toString() {
        return "Survey [Code=" + Code + ", ValidOnDate=" + ValidOnDate
                + ", Items=" + Items + ", Options=" + Options + ", Disabled="
                + Disabled + ", SurveyId=" + SurveyId + ", Name=" + Name
                + ", Scope=" + Scope + ", Type=" + Type + ", QuestionType="
                + QuestionType + ", BaseMessage=" + BaseMessage
                + ", SurveyItemList=" + SurveyItemList + "]";
    }


}

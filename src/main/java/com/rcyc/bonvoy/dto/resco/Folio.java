package com.rcyc.bonvoy.dto.resco;

import java.text.ParseException;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


//This ordering of element is required since resco api fails when the order of xml elements varies.This is a temporary soltion.Resco will be correcting their API.
@XmlType(propOrder = {"folioId", "birthCountry", "birthDate", "nationality", "documentList", "token", "advisorId", "midname", "greeting", "phone1",
        "phone1Normalized", "street", "comments", "postalCode", "login", "password", "emailMatchRequired", "canMerge",
        "canChangeName", "accessLevel", "modifyDate", "changeAddress", "email1", "type", "gender", "forename",
        "surname", "repeaterNo", "repeaterCode", "country", "language", "currency", "province", "city", "ageGroup", "externalId", "enquiryCode",
        "flagCode", "state", "privacy1", "privacy2", "privacy3", "privacy4", "privacy5", "privacy6", "privacy7",
        "privacy8", "task", "enabled", "email2", "quantity", "emergency", "survey", "surveyList", "flex01", "flex07", "flex03",
        "phone4", "booking", "travelerId", "email", "resAgentId", "note", "noteList", "disabled"})

public class Folio {

    private String token;
    private String FolioId;


    private String AdvisorId;
    private String Midname;

    private String Greeting;

    private String Phone1;

    private String Phone1Normalized;

    private String Street;

    private String Comments;

    private String PostalCode;

    private String Login;

    private String Password;

    private String EmailMatchRequired;

    private String CanMerge;

    private String CanChangeName;

    private String AccessLevel;

    private String ModifyDate;

    private String ChangeAddress;

    private String Email1;

    private String Type;

    private String Gender;

    private String Forename;

    private String Surname;

    private String RepeaterNo;

    private String RepeaterCode;

    private String Country;

    private String Language;

    private String Currency;

    private String Province;

    private String City;

    private String AgeGroup;

    private String ExternalId;

    private String EnquiryCode;

    private String FlagCode;

    private String State;

    private String Privacy1;

    private String Privacy2;

    private String Privacy3;

    private String Privacy4;

    private String Privacy5;

    private String Privacy6;

    private String Privacy7;

    private String Privacy8;

    private String Task;

    private String Enabled;

    private String Disabled;

    private String Email2;

    private String BirthDate;


    private String BirthCountry;
    private String Quantity;
    private DocumentList documentList;

    private Emergency Emergency;

    private String Survey;

    private SurveyList SurveyList;

    private String nationality;

    private String flex01;//Policy Number

    private String flex07;//Company Name

    private String flex03;//Type of Policy

    private String phone4;//Type of Policy

    private Booking booking;

    private String travelerId;

    private String email;

    private String resAgentId;

    private String note;

    private NoteList noteList;

    @XmlElement(name = "Nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @XmlElement(name = "Emergency")
    public Emergency getEmergency() {
        return Emergency;
    }

    public void setEmergency(Emergency emergency) {
        Emergency = emergency;
    }

    @XmlElement(name = "BirthCountry")
    public String getBirthCountry() {
        return BirthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        BirthCountry = birthCountry;
    }

    /**
     * @return the password
     */
    @XmlElement(name = "Password")
    public String getPassword() {
        return Password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        Password = password;
    }

    /**
     * @return the state
     */
    @XmlElement(name = "State")
    public String getState() {
        return State;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        State = state;
    }

    /**
     * @return the emailMatchRequired
     */
    @XmlElement(name = "EmailMatchRequired")
    public String getEmailMatchRequired() {
        return EmailMatchRequired;
    }

    /**
     * @param emailMatchRequired the emailMatchRequired to set
     */
    public void setEmailMatchRequired(String emailMatchRequired) {
        EmailMatchRequired = emailMatchRequired;
    }

    /**
     * @return the canMerge
     */
    @XmlElement(name = "CanMerge")
    public String getCanMerge() {
        return CanMerge;
    }

    /**
     * @param canMerge the canMerge to set
     */
    public void setCanMerge(String canMerge) {
        CanMerge = canMerge;
    }

    /**
     * @return the privacy5
     */
    @XmlElement(name = "Privacy5")
    public String getPrivacy5() {
        return Privacy5;
    }

    /**
     * @param privacy5 the privacy5 to set
     */
    public void setPrivacy5(String privacy5) {
        Privacy5 = privacy5;
    }

    /**
     * @return the changeAddress
     */
    @XmlElement(name = "ChangeAddress")
    public String getChangeAddress() {
        return ChangeAddress;
    }

    /**
     * @param changeAddress the changeAddress to set
     */
    public void setChangeAddress(String changeAddress) {
        ChangeAddress = changeAddress;
    }

    @XmlElement(name = "Greeting")
    public String getGreeting() {
        return Greeting;
    }

    public void setGreeting(String Greeting) {
        this.Greeting = Greeting;
    }

    @XmlElement(name = "Phone1")
    public String getPhone1() {
        return Phone1;
    }

    public void setPhone1(String Phone1) {
        this.Phone1 = Phone1;
    }

    @XmlElement(name = "Street")
    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    @XmlElement(name = "Comments")
    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    @XmlElement(name = "PostalCode")
    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    @XmlElement(name = "Email1")
    public String getEmail1() {
        return Email1;
    }

    public void setEmail1(String Email1) {
        this.Email1 = Email1;
    }

    @XmlElement(name = "Email2")
    public String getEmail2() {
        return Email2;
    }

    public void setEmail2(String Email2) {
        this.Email2 = Email2;
    }

    @XmlElement(name = "Type")
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @XmlElement(name = "Gender")
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @XmlElement(name = "Forename")
    public String getForename() {
        return Forename;
    }

    public void setForename(String Forename) {
        this.Forename = Forename;
    }

    @XmlElement(name = "Surname")
    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    @XmlElement(name = "RepeaterNo")
    public String getRepeaterNo() {
        return RepeaterNo;
    }

    public void setRepeaterNo(String repeaterNo) {
        RepeaterNo = repeaterNo;
    }

    @XmlElement(name = "RepeaterCode")
    public String getRepeaterCode() {
        return RepeaterCode;
    }

    public void setRepeaterCode(String repeaterCode) {
        RepeaterCode = repeaterCode;
    }

    @XmlElement(name = "Country")
    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @XmlElement(name = "Province")
    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    @XmlElement(name = "City")
    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    @XmlElement(name = "AgeGroup")
    public String getAgeGroup() {
        return AgeGroup;
    }

    public void setAgeGroup(String AgeGroup) {
        this.AgeGroup = AgeGroup;
    }

    @XmlElement(name = "ExternalId")
    public String getExternalId() {
        return ExternalId;
    }

    public void setExternalId(String externalId) {
        ExternalId = externalId;
    }

    @XmlElement(name = "EnquiryCode")
    public String getEnquiryCode() {
        return EnquiryCode;
    }

    public void setEnquiryCode(String enquiryCode) {
        EnquiryCode = enquiryCode;
    }

    @XmlElement(name = "FlagCode")
    public String getFlagCode() {
        return FlagCode;
    }

    public void setFlagCode(String flagCode) {
        FlagCode = flagCode;
    }

    @XmlElement(name = "Privacy2")
    public String getPrivacy2() {
        return Privacy2;
    }

    public void setPrivacy2(String privacy2) {
        Privacy2 = privacy2;
    }

    @XmlElement(name = "Privacy8")
    public String getPrivacy8() {
        return Privacy8;
    }

    public void setPrivacy8(String privacy8) {
        Privacy8 = privacy8;
    }

    /**
     * @return the login
     */
    @XmlElement(name = "Login")
    public String getLogin() {
        return Login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        Login = login;
    }

    /**
     * @return the folioId
     */
    @XmlElement(name = "FolioId")
    public String getFolioId() {
        return FolioId;
    }

    /**
     * @param folioId the folioId to set
     */
    public void setFolioId(String folioId) {
        FolioId = folioId;
    }

    /**
     * @return the advisorId
     */
    @XmlElement(name = "AdvisorId")
    public String getAdvisorId() {
        return AdvisorId;
    }

    /**
     * @param advisorId the advisorId to set
     */
    public void setAdvisorId(String advisorId) {
        AdvisorId = advisorId;
    }

    /**
     * @return the phone1Normalized
     */
    @XmlElement(name = "Phone1Normalized")
    public String getPhone1Normalized() {
        return Phone1Normalized;
    }

    /**
     * @param phone1Normalized the phone1Normalized to set
     */
    public void setPhone1Normalized(String phone1Normalized) {
        Phone1Normalized = phone1Normalized;
    }

    /**
     * @return the canChangeName
     */
    @XmlElement(name = "CanChangeName")
    public String getCanChangeName() {
        return CanChangeName;
    }

    /**
     * @param canChangeName the canChangeName to set
     */
    public void setCanChangeName(String canChangeName) {
        CanChangeName = canChangeName;
    }

    /**
     * @return the accessLevel
     */
    @XmlElement(name = "AccessLevel")
    public String getAccessLevel() {
        return AccessLevel;
    }

    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        AccessLevel = accessLevel;
    }

    /**
     * @return the modifyDate
     */
    @XmlElement(name = "ModifyDate")
    public String getModifyDate() {
        return ModifyDate;
    }

    /**
     * @param modifyDate the modifyDate to set
     */
    public void setModifyDate(String modifyDate) {
        ModifyDate = modifyDate;
    }

    /**
     * @return the language
     */
    @XmlElement(name = "Language")
    public String getLanguage() {
        return Language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        Language = language;
    }

    /**
     * @return the currency
     */
    @XmlElement(name = "Currency")
    public String getCurrency() {
        return Currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        Currency = currency;
    }

    /**
     * @return the privacy1
     */
    @XmlElement(name = "Privacy1")
    public String getPrivacy1() {
        return Privacy1;
    }

    /**
     * @param privacy1 the privacy1 to set
     */
    public void setPrivacy1(String privacy1) {
        Privacy1 = privacy1;
    }

    /**
     * @return the privacy3
     */
    @XmlElement(name = "Privacy3")
    public String getPrivacy3() {
        return Privacy3;
    }

    /**
     * @param privacy3 the privacy3 to set
     */
    public void setPrivacy3(String privacy3) {
        Privacy3 = privacy3;
    }

    /**
     * @return the privacy4
     */
    @XmlElement(name = "Privacy4")
    public String getPrivacy4() {
        return Privacy4;
    }

    /**
     * @param privacy4 the privacy4 to set
     */
    public void setPrivacy4(String privacy4) {
        Privacy4 = privacy4;
    }

    /**
     * @return the privacy6
     */
    @XmlElement(name = "Privacy6")
    public String getPrivacy6() {
        return Privacy6;
    }

    /**
     * @param privacy6 the privacy6 to set
     */
    public void setPrivacy6(String privacy6) {
        Privacy6 = privacy6;
    }

    /**
     * @return the privacy7
     */
    @XmlElement(name = "Privacy7")
    public String getPrivacy7() {
        return Privacy7;
    }

    /**
     * @param privacy7 the privacy7 to set
     */
    public void setPrivacy7(String privacy7) {
        Privacy7 = privacy7;
    }

    /**
     * @return the task
     */
    @XmlElement(name = "Task")
    public String getTask() {
        return Task;
    }

    /**
     * @param task the task to set
     */
    public void setTask(String task) {
        Task = task;
    }

    /**
     * @return the enabled
     */
    @XmlElement(name = "Enabled")
    public String getEnabled() {
        return Enabled;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(String enabled) {
        Enabled = enabled;
    }

    /**
     * @return the midname
     */
    @XmlElement(name = "Midname")
    public String getMidname() {
        return Midname;
    }

    /**
     * @param midname the midname to set
     */
    public void setMidname(String midname) {
        Midname = midname;
    }

    /**
     * @return the quantity
     */
    @XmlElement(name = "Quantity")
    public String getQuantity() {
        return Quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        Quantity = quantity;
    }


    @XmlElement(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     */
    public Folio() {
        super();
    }

    /**
     * @param folioId
     */
    public Folio(String folioId) {
        super();
        FolioId = folioId;
    }

    /**
     * @param login
     * @param password
     */
    public Folio(String login, String password) {
        super();
        Login = login;
        Password = password;
    }

    /**
     * @param folioId
     * @param login
     * @param password
     */
    public Folio(String folioId, String login, String password) {
        super();
        FolioId = folioId;
        Login = login;
        Password = password;
    }

    /**
     * @param surname
     * @param forename
     * @param country
     * @param email1
     * @param postalCode
     */
    public Folio(String surname, String forename, String country, String email1, String postalCode) {
        super();
        PostalCode = postalCode;
        // Email1 = email1; // commented to make changes for PSW-308
        Forename = forename;
        Surname = surname;
        Country = country;
        Login = email1; // added this part here for PSW-308
    }


    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the birthDate
     * @throws ParseException
     */
    @XmlElement(name = "BirthDate")
    public String getBirthDate() throws ParseException {
        return BirthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    @XmlElement(name = "Survey")
    public String getSurvey() {
        return Survey;
    }

    public void setSurvey(String survey) {
        Survey = survey;
    }

    @XmlElement(name = "DocumentList")
    public DocumentList getDocumentList() {
        return documentList;
    }

    public void setDocumentList(DocumentList documentList) {
        this.documentList = documentList;
    }

    @XmlElement(name = "SurveyList")
    public SurveyList getSurveyList() {
        return SurveyList;
    }

    public void setSurveyList(SurveyList surveyList) {
        SurveyList = surveyList;
    }

    @XmlElement(name = "Flex01")
    public String getFlex01() {
        return flex01;
    }

    public void setFlex01(String flex01) {
        this.flex01 = flex01;
    }

    @XmlElement(name = "Flex07")
    public String getFlex07() {
        return flex07;
    }

    public void setFlex07(String flex07) {
        this.flex07 = flex07;
    }

    @XmlElement(name = "Flex03")
    public String getFlex03() {
        return flex03;
    }

    public void setFlex03(String flex03) {
        this.flex03 = flex03;
    }

    @XmlElement(name = "Phone4")
    public String getPhone4() {
        return phone4;
    }

    public void setPhone4(String phone4) {
        this.phone4 = phone4;
    }

    @XmlElement(name = "Booking")
    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @XmlElement(name = "TravelerId")
    public String getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(String travelerId) {
        this.travelerId = travelerId;
    }

    @XmlElement(name = "ResAgentId")
    public String getResAgentId() {
        return resAgentId;
    }

    public void setResAgentId(String resAgentId) {
        this.resAgentId = resAgentId;
    }

    @XmlElement(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlElement(name = "NoteList")
    public NoteList getNoteList() {
        return noteList;
    }

    public void setNoteList(NoteList noteList) {
        this.noteList = noteList;
    }


    @XmlElement(name = "Disabled")
    public String getDisabled() {
        return Disabled;
    }

    public void setDisabled(String disabled) {
        Disabled = disabled;
    }

    @Override
    public String toString() {
        return "Folio [token=" + token + ", FolioId=" + FolioId + ", AdvisorId=" + AdvisorId + ", Midname=" + Midname
                + ", Greeting=" + Greeting + ", Phone1=" + Phone1 + ", Phone1Normalized=" + Phone1Normalized
                + ", Street=" + Street + ", Comments=" + Comments + ", PostalCode=" + PostalCode + ", Login=" + Login
                + ", Password=" + Password + ", EmailMatchRequired=" + EmailMatchRequired + ", CanMerge=" + CanMerge
                + ", CanChangeName=" + CanChangeName + ", AccessLevel=" + AccessLevel + ", ModifyDate=" + ModifyDate
                + ", ChangeAddress=" + ChangeAddress + ", Email1=" + Email1 + ", Type=" + Type + ", Gender=" + Gender
                + ", Forename=" + Forename + ", Surname=" + Surname + ", Country=" + Country + ", Language=" + Language
                + ", Currency=" + Currency + ", Province=" + Province + ", City=" + City + ", AgeGroup=" + AgeGroup
                + ", ExternalId=" + ExternalId + ", EnquiryCode=" + EnquiryCode + ", FlagCode=" + FlagCode + ", State="
                + State + ", Privacy1=" + Privacy1 + ", Privacy2=" + Privacy2 + ", Privacy3=" + Privacy3 + ", Privacy4="
                + Privacy4 + ", Privacy5=" + Privacy5 + ", Privacy6=" + Privacy6 + ", Privacy7=" + Privacy7
                + ", Privacy8=" + Privacy8 + ", Task=" + Task + ", Enabled=" + Enabled + ", Email2=" + Email2
                + ", BirthDate=" + BirthDate + ", BirthCountry=" + BirthCountry + ", Quantity=" + Quantity
                + ", documentList=" + documentList + ", Emergency=" + Emergency + ", Survey=" + Survey + ", SurveyList="
                + SurveyList + ", nationality=" + nationality + "]";
    }


}


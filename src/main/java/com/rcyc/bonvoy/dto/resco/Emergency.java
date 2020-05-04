package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author sreejithjn
 * Created :27-Mar-2020
 */
public class Emergency {

    private String Greeting;

    private String Phone1;

    private String Email;

    private String Email1;

    private String Forename;

    private String Surname;

    private String Relation;

    private String Phone2;


    @XmlElement(name = "Phone2")
    public String getPhone2() {
        return Phone2;
    }

    public void setPhone2(String phone2) {
        Phone2 = phone2;
    }

    @XmlElement(name = "Relation")
    public String getRelation() {
        return Relation;
    }

    public void setRelation(String relation) {
        Relation = relation;
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

    @XmlElement(name = "Email")
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @XmlElement(name = "Email1")
    public String getEmail1() {
        return Email1;
    }

    public void setEmail1(String Email1) {
        this.Email1 = Email1;
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


    /**
     *
     */
    public Emergency() {
        super();
    }

    @Override
    public String toString() {
        return "ClassPojo [Greeting = " + Greeting + ", Phone1 = " + Phone1 + ", Email = " + Email + ", Email1 = " + Email1 + ", Forename = " + Forename + ", Surname = " + Surname + "]";
    }

}
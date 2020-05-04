package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author sreejithjn
 */
@XmlRootElement(name = "ReqListSurcharge")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqListSurcharge {

    @XmlElement(name = "User")
    public User user;

    @XmlElement(name = "Agency")
    public Agency agency;

    @XmlElement(name = "Surcharge")
    public Surcharge surcharge;

    public ReqListSurcharge() {
    }

    public ReqListSurcharge(User user, Agency agency, Surcharge surcharge) {
        this.user = user;
        this.agency = agency;
        this.surcharge = surcharge;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Surcharge getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(Surcharge surcharge) {
        this.surcharge = surcharge;
    }
}

package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class SurchargeList {

    @XmlElement
    ArrayList<Surcharge> Surcharge = new ArrayList<Surcharge>();

    public SurchargeList() {
    }

    public ArrayList<com.rcyc.bonvoy.dto.resco.Surcharge> getSurcharge() {
        return Surcharge;
    }

    public void setSurcharge(ArrayList<com.rcyc.bonvoy.dto.resco.Surcharge> surcharge) {
        Surcharge = surcharge;
    }
}

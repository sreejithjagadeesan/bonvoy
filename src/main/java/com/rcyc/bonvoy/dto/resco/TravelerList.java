/**
 *
 */
package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author sreejithjn
 * Created :27-Mar-2020
 */
public class TravelerList {

    private List<com.rcyc.bonvoy.dto.resco.Traveler> Traveler;

    /**
     * @return the traveler
     */
    @XmlElement(name = "Traveler")
    public List<com.rcyc.bonvoy.dto.resco.Traveler> getTraveler() {
        return Traveler;
    }

    /**
     * @param traveler the traveler to set
     */
    public void setTraveler(List<com.rcyc.bonvoy.dto.resco.Traveler> traveler) {
        Traveler = traveler;
    }

    @Override
    public String toString() {
        return "TravelerList [Traveler=" + Traveler + "]";
    }


}

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
public class TripList {

	private List<Trip> tripList;

	/**
	 * @return the trip
	 */
	@XmlElement(name = "Trip")
	public List<Trip> getTripList() {
		return tripList;
	}

	/**
	 * @param tripList the tripList to set
	 */
	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}

	
	
	
}

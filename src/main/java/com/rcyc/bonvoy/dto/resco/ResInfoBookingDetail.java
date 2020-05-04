/**
 * 
 */
package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sreejithjn
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ResInfoBookingDetail")
public class ResInfoBookingDetail {

	private ResBooking Booking;

	private Result Result;
	
	

	/**
	 * @return the booking
	 */
	@XmlElement(name = "Booking")
	public ResBooking getBooking() {
		return Booking;
	}

	/**
	 * @param booking the booking to set
	 */
	public void setBooking(ResBooking booking) {
		this.Booking = booking;
	}

	/**
	 * @return the result
	 */
	@XmlElement(name = "Result")
	public Result getResult() {
		return Result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(Result result) {
		this.Result = result;
	}

}

/**
 * 
 */
package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author sreejithjn
 * Created :27-Mar-2020
 */
public class Delivery {
	
	
	private String Type;
	
    private String date;
	
	

	/**
	 * 
	 */
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param type
	 * @param date
	 */
	public Delivery(String type, String date) {
		super();
		Type = type;
		this.date = date;
	}

	/**
	 * @return the type
	 */
	@XmlElement(name="Type")
	public String getType() {
		return Type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		Type = type;
	}

	/**
	 * @return the date
	 */
	@XmlElement(name="Date")
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	
    
    

}

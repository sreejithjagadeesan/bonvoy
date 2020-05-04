package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class FlexItemColumn {
	
	private String itemId;
	

	private String itemColumnName;
	
	
	private String value;

	public FlexItemColumn() {
		// TODO Auto-generated constructor stub
	}
	
	public FlexItemColumn(String itemId, String itemColumnName, String value) {
		this.itemId=itemId;
		this.itemColumnName=itemColumnName;
		this.value=value;
		// TODO Auto-generated constructor stub
	}
	
	@XmlElement(name = "ItemId")	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	@XmlElement(name = "ItemColumnName")
	public String getItemColumnName() {
		return itemColumnName;
	}

	public void setItemColumnName(String itemColumnName) {
		this.itemColumnName = itemColumnName;
	}
	@XmlElement(name = "Value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	
	

}

package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class FlexItemList {

	private List<FlexItem> flexItem;

	public FlexItemList() {
		// TODO Auto-generated constructor stub
	}

	public FlexItemList(List<FlexItem> flexItem) {
		this.flexItem = flexItem;
	}

	@XmlElement(name = "FlexItem")
	public List<FlexItem> getFlexItem() {
		return flexItem;
	}

	public void setFlexItem(List<FlexItem> flexItem) {
		this.flexItem = flexItem;
	}

}

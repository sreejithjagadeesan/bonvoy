package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class FlexItem {

	private String flexItemId;
	private List<FlexItemColumn> flexItemColumn;

	@XmlElement(name = "FlexItemId")
	public String getFlexItemId() {
		return flexItemId;
	}

	public void setFlexItemId(String flexItemId) {
		this.flexItemId = flexItemId;
	}

	public FlexItem(List<FlexItemColumn> flexItemColumn) {
		super();
		this.flexItemColumn = flexItemColumn;
	}

	@XmlElement(name = "FlexItemColumn")
	public List<FlexItemColumn> getFlexItemColumn() {
		return flexItemColumn;
	}

	public void setFlexItemColumn(List<FlexItemColumn> flexItemColumn) {
		this.flexItemColumn = flexItemColumn;
	}

	public FlexItem() {
		super();
	}

}

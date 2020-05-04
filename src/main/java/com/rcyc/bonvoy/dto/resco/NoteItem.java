package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class NoteItem {


    private String ItemId;

    private String ItemColumnName;

    private String Value;

    private String Info;


    @XmlElement(name = "ItemId")
    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    @XmlElement(name = "ItemColumnName")
    public String getItemColumnName() {
        return ItemColumnName;
    }

    public void setItemColumnName(String itemColumnName) {
        ItemColumnName = itemColumnName;
    }

    @XmlElement(name = "Value")
    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    @XmlElement(name = "Info")
    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }


    @Override
    public String toString() {
        return "ClassPojo [ItemId = " + ItemId + ", ItemColumnName = " + ItemColumnName + ", Value = " + Value + ", Info = " + Info + "]";

    }


}

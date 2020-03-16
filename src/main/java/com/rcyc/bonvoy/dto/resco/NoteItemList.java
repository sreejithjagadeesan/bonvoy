package com.rcyc.bonvoy.dto.resco;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class NoteItemList {

    private List<NoteItem> NoteItem;


    @XmlElement(name = "NoteItem")
    public List<NoteItem> getNoteItem() {
        return NoteItem;
    }

    public void setNoteItem(List<NoteItem> noteItem) {
        NoteItem = noteItem;
    }


    @Override
    public String toString() {
        return "ClassPojo [NoteItem = " + NoteItem + "]";
    }


}


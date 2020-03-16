package com.rcyc.bonvoy.dto.resco;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class NoteList {

    private List<Note> Note;

    public NoteList() {
        // TODO Auto-generated constructor stub
    }

    @XmlElement(name = "Note")
    public List<Note> getNote() {
        return Note;
    }

    public void setNote(List<Note> note) {
        Note = note;
    }

}


package com.rcyc.bonvoy.dto.resco;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class DocumentList {

    private List<Document> document;


    /**
     *
     */
    public DocumentList() {
        super();
    }

    public DocumentList(List<Document> document) {
        super();
        this.document = document;
    }

    @XmlElement(name = "Document")
    public List<Document> getDocument() {
        return document;
    }

    public void setDocument(List<Document> document) {
        this.document = document;
    }

}


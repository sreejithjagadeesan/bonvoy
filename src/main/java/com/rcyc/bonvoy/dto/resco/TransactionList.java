package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class TransactionList {


    private List<com.rcyc.bonvoy.dto.resco.Transaction> transaction;

    @XmlElement(name = "Transaction")
    public List<com.rcyc.bonvoy.dto.resco.Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<com.rcyc.bonvoy.dto.resco.Transaction> transaction) {
        this.transaction = transaction;
    }


}

package com.home.apps.budgetApp.data.payloads.request;

import java.util.Date;


public class IncomeRequest {

    private String owner;
    private String amount;
    private Date date;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

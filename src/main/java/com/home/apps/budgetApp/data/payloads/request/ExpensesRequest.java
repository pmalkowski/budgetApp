package com.home.apps.budgetApp.data.payloads.request;

import com.home.apps.budgetApp.data.models.Budget;
import com.home.apps.budgetApp.data.models.BudgetType;

import java.util.Date;

public class ExpensesRequest {
    private String name;
    private String owner;
    private String amount;
    private Date date;
    private Integer budget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }
}

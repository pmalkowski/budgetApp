package com.home.apps.budgetApp.data.payloads.request;

import java.util.Date;

public class BudgetRequest {

    private String budget_name;
    private Float plan;
    private Date realization_date;

    public String getBudget_name() {
        return budget_name;
    }

    public void setBudget_name(String budget_name) {
        this.budget_name = budget_name;
    }

    public Float getPlan() {
        return plan;
    }

    public void setPlan(Float plan) {
        this.plan = plan;
    }

    public Date getRealization_date() {
        return realization_date;
    }

    public void setRealization_date(Date realization_date) {
        this.realization_date = realization_date;
    }
}

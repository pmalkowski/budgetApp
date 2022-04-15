package com.home.apps.budgetApp.data.models;


import javax.persistence.*;
import java.util.Date;


@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String budget_name;
    private Float plan;
    private Date realization_date;

    public Budget(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Budget{" +
                "id=" + id +
                ", budget_name='" + budget_name + '\'' +
                ", plan=" + plan +
                ", realization_date=" + realization_date +
                '}';
    }
}

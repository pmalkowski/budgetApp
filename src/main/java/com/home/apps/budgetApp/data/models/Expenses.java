package com.home.apps.budgetApp.data.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private String owner;
    private String amount;
    private Date date;
    //@ManyToOne
    //@JoinColumn(name = "budget_id")
    private Integer budget;

    public Expenses(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", amount='" + amount + '\'' +
                ", date=" + date +
                ", budget=" + budget +
                '}';
    }
}

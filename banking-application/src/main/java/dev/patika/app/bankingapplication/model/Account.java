package dev.patika.app.bankingapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {


    private @Id
    @GeneratedValue
    Long id;
    private boolean active;
    private String currency;
    private Double balance;

    public boolean isActive() {
        return active;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getBalance() {
        return balance;
    }

    public Account() {
    }

    public Account(boolean active, String currency, Double balance) {
        this.active = active;
        this.currency = currency;
        this.balance = balance;
    }
}

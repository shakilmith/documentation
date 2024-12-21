package com.company.model;

import jakarta.persistence.*;


public class Bank {
    @Id
    private int id;
    @Column(name = "bank_name")
    private String bankName;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Bank() {
    }

    public Bank(int id, String bankName) {
        this.id = id;
        this.bankName = bankName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

package com.company;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "Person")
@Table(name = "person")
public class Person extends PanacheEntity {
    public String firstName;
    public String lastName;
    public String role;

    public Person() {
    }

    public Person(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
//getter and setter methods will be added
}

package com.company.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity(name = "Person")
@Table(name = "person")
public class Person extends PanacheEntity{
    /**
     * id field is added automatically when you
     * extends panacheEntity
     */
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public String role;


    public Person() {
    }

    public Person(String firstName, String lastName, int age, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.role = role;
    }

    /**
     * getter and setter methods are omitted as they will be
     * handled by PanacheEntity, even id will be generated programmatically
     * if you want to create id externally please extends PanacheEntityBase instead of
     * PanacheEntity
     */

}

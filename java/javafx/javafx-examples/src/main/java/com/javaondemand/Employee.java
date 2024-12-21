package com.javaondemand;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Employee {

    private StringProperty firstName;
    private StringProperty lastName;
    private IntegerProperty age;

    public Employee() {
    }

    public Employee(StringProperty firstName, StringProperty lastName, IntegerProperty age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public int getAge() {
        return age.get();
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }
}

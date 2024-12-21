package com.company.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.StringJoiner;

public class Address {
    @Column(name = "city")
    private String city;
    @Column(name = "street_number")
    private String streetNumber;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "zip_code")
    private String zipCode;

    public Address() {
    }

    public Address(String city, String streetNumber, String houseNumber, String zipCode) {
        this.city = city;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("city='" + city + "'")
                .add("streetNumber='" + streetNumber + "'")
                .add("houseNumber='" + houseNumber + "'")
                .add("zipCode='" + zipCode + "'")
                .toString();
    }
}

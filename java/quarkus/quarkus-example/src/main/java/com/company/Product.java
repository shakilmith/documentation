package com.company;

public class Product {
    public String name;
    public int price;
    public boolean isAvailable;

    public Product() {
    }

    public Product(String name, int price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }
}

package com.javaondemand;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo File");

        List<Fruit> fruits = List.of(
                new Fruit("Apple"),
                new Fruit("Banana"),
                new Fruit("Orange")
        );

        for(Fruit f: fruits){
            System.out.println(f.getName());
        }




    }
}

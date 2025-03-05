package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(List.of(
                new Person("Shakil", 20),
                new Person("Rbeka", 30),
                new Person("Hudi", 40)
        ));

        //iterate
        for (Person p: list){
            System.out.println(p);
        }
    }
}

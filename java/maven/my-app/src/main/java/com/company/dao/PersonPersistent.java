package com.company.dao;

import com.company.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class PersonPersistent {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin(); //it will start the transaction

        Person p1 = new Person(101, "Barney", "Harold", 30, "Male", "Java Developer", "Helsinki", "Finland");
        Person p2 = new Person(102, "Henry", "Vincent", 45, "Male", "Java Developer", "Kazan", "Russia");
        Person p3 = new Person(103, "Trevor", "Chris", 40, "Male", "SQL Developer", "Brussels", "Belgium");
        Person p4 = new Person(104, "Alex", "David",  29, "Male", "Python Developer", "Sydney", "Australia");
        Person p5 = new Person(105, "Finn", "Dan", 49, "Male", "Cleaner", "Sydney", "Australia");
        Person p6 = new Person(106, "Sophia", "Tiffany", 45, "Female", "Graphic Designer", "Melbourne", "Australia");
        Person p7 = new Person(107, "Chad", "Ralph", 41, "Male", "Web developer", "Berlin", "Germany");
        Person p8 = new Person(108, "Aaron", "Chris", 37, "Male", "JavaFX Developer", "Frakfurt", "Germany");
        Person p9 = new Person(109, "Adam", "Chris", 30, "Male", "Rust Developer", "Seville", "Spain");
        Person p10 = new Person(110, "Alena", "Lopez", 31, "Female", "Backend Developer", "Oslo", "Norway");


        //persist
        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.persist(p4);
        entityManager.persist(p5);
        entityManager.persist(p6);
        entityManager.persist(p7);
        entityManager.persist(p8);
        entityManager.persist(p9);
        entityManager.persist(p10);




        entityManager.getTransaction().commit(); //it will commit the transaction
        entityManager.close();
        entityManagerFactory.close();
    }
}

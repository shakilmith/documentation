package com.company.dao;

import com.company.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.nio.channels.Pipe;
import java.util.List;

public class JpqlOperation {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin(); //it will start the transaction


        Query query = entityManager.createQuery("SELECT p from Person p WHERE p.gender = 'Female' ");

        @SuppressWarnings("unchecked")
        List<Person> personList = query.getResultList();

        System.out.println("First Name "+" "+ "Last Name"+ "\t"+ "Role");
        for(Person p: personList){
            System.out.println(p.getFirstName() + "\t\t"+ p.getLastName()+ "\t\t"+p.getRole());
        }






        entityManager.getTransaction().commit(); //it will commit the transaction
        entityManager.close();
        entityManagerFactory.close();
    }
}

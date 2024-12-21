package com.company.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FakePersistent {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin(); //it will start the transaction



        entityManager.getTransaction().commit(); //it will commit the transaction
        entityManager.close();
        entityManagerFactory.close();
    }
}

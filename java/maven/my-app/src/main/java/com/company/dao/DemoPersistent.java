package com.company.dao;

import com.company.model.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class DemoPersistent {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin(); //it will start the transaction

        //create few objects of child entities
        FrontendDeveloper f1 = new FrontendDeveloper(101, "Shakil Ahmed", "JavaScript Developer", 700);
        FrontendDeveloper f2 = new FrontendDeveloper(102, "Mark Smith", "UI/UX designer", 900);

        BackendDeveloper b1 = new BackendDeveloper(103, "Selena Gomez", "Java Developer", 3, 1200, 100);
        BackendDeveloper b2 = new BackendDeveloper(104, "Don Roger", "Rust Developer", 5, 1500, 300);

        //using entity-manager persist method to save the entity objects
        entityManager.persist(f1);
        entityManager.persist(f2);
        entityManager.persist(b1);
        entityManager.persist(b2);


        entityManager.getTransaction().commit(); //it will commit the transaction
        entityManager.close();
        entityManagerFactory.close();
    }
}

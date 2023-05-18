/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.dejep;

import com.mycompany.dejep.models.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author titib
 */
public class Dejep {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Dejep-PU");
        EntityManager entityManager = emf.createEntityManager();

        Book book = entityManager.find(Book.class, 1);

        System.out.println("\n" + book.getName() + "\n");

        entityManager.close();
        emf.close();
    }
}

package com.mycompany.dejep.models.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EntityUtils {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Dejep-PU");

    public static void insert(Object entity) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    public static void update(Object entity) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }

    public static void delete(Object entity) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
    }

    public static <T> List<T> select(String query, Class<T> entityClass) {
        EntityManager em = emf.createEntityManager();

        return em.createQuery(query, entityClass).getResultList();
    }
}

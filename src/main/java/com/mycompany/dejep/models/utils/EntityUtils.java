package com.mycompany.dejep.models.utils;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import javax.persistence.PersistenceException;

public class EntityUtils {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Dejep-PU");

    public static void insert(Object entity) throws PersistenceException, SQLException, Exception {
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
        em.remove(em.contains(entity) ? entity : em.merge(entity));
        em.getTransaction().commit();
    }

    public static <T> List<T> select(String query, Class<T> entityClass) {
        EntityManager em = emf.createEntityManager();

        return em.createQuery(query, entityClass).getResultList();
    }

    public static <T> T find(Class<T> entityClass, int identifier) {
        EntityManager em = emf.createEntityManager();
        return em.find(entityClass, identifier);
    }
}

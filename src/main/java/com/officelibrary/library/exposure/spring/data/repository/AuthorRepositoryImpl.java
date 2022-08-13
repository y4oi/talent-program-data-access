package com.officelibrary.library.exposure.spring.data.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.officelibrary.library.exposure.model.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorRepositoryImpl implements AuthorRepository {

    private final EntityManagerFactory emf;

    public AuthorRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Author> findByNameAndSurname(String name, String surname) {
        TypedQuery<Author> query = getEntityManager().createQuery("SELECT a FROM Author a " +
            "WHERE a.name = :name and a.surname = :surname", Author.class);
        query.setParameter("name", name);
        query.setParameter("surname", surname);

        return query.getResultList();
    }

    @Override
    public List<Author> findBySurnameNotLike(String surname) {
        TypedQuery<Author> query = getEntityManager().createQuery("SELECT a FROM Author a " +
            "WHERE a.surname NOT LIKE :surname", Author.class);
        query.setParameter("surname", "%" + surname + "%");

        return query.getResultList();
    }

    @Override
    public List<Author> findByNamesLongerThan(Integer minNameLength) {
        Query query = getEntityManager().createNativeQuery("SELECT * FROM Author a " +
            "WHERE LENGTH(a.name) >= :minNameLength", Author.class);
        query.setParameter("minNameLength", minNameLength);
        return (List<Author>) query.getResultList();
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}

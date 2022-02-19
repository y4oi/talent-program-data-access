package com.officelibrary.library.exposure.spring.data.repository.jpa;

import java.util.List;

import com.officelibrary.library.exposure.model.Author;
import com.officelibrary.library.exposure.spring.data.repository.AuthorRepository;

public class AuthorRepositoryJpa implements AuthorRepository {
    @Override
    public List<Author> findByNameAndSurname(String name, String surname) {
        return null;
    }

    @Override
    public List<Author> findBySurnameNotLike(String surname) {
        return null;
    }

    @Override
    public List<Author> findByNamesLongerThan(Integer minNameLength) {
        return null;
    }
}

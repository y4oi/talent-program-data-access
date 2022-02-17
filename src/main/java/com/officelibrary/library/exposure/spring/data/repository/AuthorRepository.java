package com.officelibrary.library.exposure.spring.data.repository;

import java.util.List;

import com.officelibrary.library.exposure.model.Author;

public interface AuthorRepository {

    public List<Author> findByNameAndSurName(String name, String surname);

    public List<Author> findByLastNameNotLike(String lastName);

    public List<Author> findNamesLongerThan(Integer minNameLength);

}

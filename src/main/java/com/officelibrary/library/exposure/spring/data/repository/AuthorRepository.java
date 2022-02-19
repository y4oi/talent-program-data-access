package com.officelibrary.library.exposure.spring.data.repository;

import java.util.List;

import com.officelibrary.library.exposure.model.Author;

public interface AuthorRepository {

    public List<Author> findByNameAndSurname(String name, String surname);

    public List<Author> findBySurnameNotLike(String surname);

    public List<Author> findByNamesLongerThan(Integer minNameLength);

}

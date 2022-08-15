package com.officelibrary.library.exposure.spring.data.service;

import java.util.List;

import com.officelibrary.library.exposure.model.Author;
import com.officelibrary.library.exposure.spring.data.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findByNameAndSurname(String name, String surname) {
        return authorRepository.findByNameAndSurname(name, surname);
    }

    public List<Author> findBySurnameNotLike(String surname) {
        return authorRepository.findBySurnameNotContaining(surname);
    }

    public List<Author> findByNamesLongerThan(Integer minNameLength) {
        return authorRepository.findByNamesLongerThan(minNameLength);
    }

}

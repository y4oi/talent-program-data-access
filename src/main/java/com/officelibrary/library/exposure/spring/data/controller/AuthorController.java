package com.officelibrary.library.exposure.spring.data.controller;

import java.util.List;

import com.officelibrary.library.exposure.model.Author;
import com.officelibrary.library.exposure.spring.data.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libraryAPI")
public class AuthorController {

    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors/findByNameAndSurname")
    public List<Author> findByNameAndSurname(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        throw new UnsupportedOperationException();
    }

    @GetMapping("/authors/findBySurnameNotLike")
    public List<Author> findBySurnameNotLike(@RequestParam(value = "surname") String surname) {
        throw new UnsupportedOperationException();
    }

    @GetMapping("/authors/findByNamesLongerThan")
    public List<Author> findBySurnameNotLike(@RequestParam(value = "minNameLength") Integer minNameLength) {
        throw new UnsupportedOperationException();
    }

}

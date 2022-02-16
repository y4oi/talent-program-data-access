package com.officelibrary.library.exposure.spring.data.repository.jpa;

import java.util.List;

import com.officelibrary.library.exposure.model.Book;
import com.officelibrary.library.exposure.spring.data.repository.BookRepository;

public class BookRepositoryJpa implements BookRepository {
    @Override
    public List<Book> findAllByTitle(String title) {
        return null;
    }
}

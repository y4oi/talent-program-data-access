package com.officelibrary.library.exposure.spring.data.repository;

import java.util.List;

import com.officelibrary.library.exposure.model.Book;


public interface BookRepository {

    List<Book> findAllByTitle(String title);

}

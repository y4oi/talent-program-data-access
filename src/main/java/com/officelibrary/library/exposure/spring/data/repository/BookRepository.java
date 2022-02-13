package com.officelibrary.library.exposure.spring.data.repository;

import java.util.List;

import com.officelibrary.library.exposure.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findAllByTitle(String title);

}

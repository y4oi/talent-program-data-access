package com.officelibrary.library.exposure.spring.data.repository.springdata;

import com.officelibrary.library.exposure.model.Book;
import com.officelibrary.library.exposure.spring.data.repository.BookRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositorySpringData extends BookRepository, JpaRepository<Book, Integer> {

}

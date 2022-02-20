package com.officelibrary.library.exposure.spring.data.service;

import java.util.List;
import java.util.Optional;

import com.officelibrary.library.exposure.model.Book;
import com.officelibrary.library.exposure.spring.data.repository.springdata.BookRepositorySpringData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class BookService {

    private BookRepositorySpringData bookRepository;


    @Autowired
    public BookService(BookRepositorySpringData bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getBooks() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Optional<List<Book>> getBookByTitle(String title) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Optional<Book> getBookById(int id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void deleteBook(Book book) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void deleteBookById(int id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void updateBook(int id, Book newBook) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

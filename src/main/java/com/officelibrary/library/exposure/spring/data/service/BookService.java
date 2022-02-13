package com.officelibrary.library.exposure.spring.data.service;

import java.util.List;
import java.util.Optional;

import com.officelibrary.library.exposure.model.Book;
import com.officelibrary.library.exposure.spring.data.repository.BookRepository;
import com.officelibrary.library.exposure.spring.data.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class BookService {

    private BookRepository bookRepository;

    private CategoryRepository categoryRepository;

    @Autowired
    public BookService(BookRepository bookRepository, CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
    }

    public Book addBook(Book book) {
        categoryRepository.save(book.getCategory());
        return bookRepository.save(book);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Optional<List<Book>> getBookByTitle(String title) {
        return Optional.ofNullable(bookRepository.findAllByTitle(title));
    }

    public Optional<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }

    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    public void deleteBookById(int id) {
        Optional<Book> book = getBookById(id);
        book.ifPresent(book1 -> bookRepository.delete(book1));
    }

    public void updateBook(int id, Book newBook) {
        Optional<Book> bookOptional = getBookById(id);
        bookOptional.ifPresent(book -> bookRepository.save(book));
    }
}

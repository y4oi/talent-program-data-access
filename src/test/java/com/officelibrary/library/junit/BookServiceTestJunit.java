package com.officelibrary.library.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.officelibrary.library.exposure.model.Author;
import com.officelibrary.library.exposure.model.Book;
import com.officelibrary.library.exposure.model.Category;
import com.officelibrary.library.exposure.spring.data.repository.BookRepository;
import com.officelibrary.library.exposure.spring.data.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
//@SpringBootTest
class BookServiceTestJunit {

    private static final List<Book> library = Arrays.asList(
        new Book("Ulysses", "Ulysses chronicles", List.of(new Author("James", "Joyce")), new Category("Myths")),
        new Book("Don Quixote", "Retired country gentleman in his fifties", List.of(new Author("Miguel", "de Cervantes")),
            new Category("Legends")),
        new Book("One Hundred Years of Solitude", "Widely beloved and acclaimed novel", null, new Category("Magic Realism")),
        new Book("The Great Gatsby", "An era that Fitzgerald himself dubbed the.",
            List.of(new Author("Francis Scott", "Fitzgerald")), new Category("Thriller"))
    );

    @Mock
    BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

   /* @BeforeEach
    void reset() {
        bookService = new BookService();
    }*/

    @Test
    void addAndGetASingleBookTest() {
        //given
        bookService.addBook(library.get(0));

        //when
        Optional<List<Book>> books = bookService.getBookByTitle("Ulysses");
        assertTrue(books.isPresent());
        Book book = books.get().get(0);
        assertAll(
            "Assert Ulysses is present",
            () -> assertEquals("Ulysses", book.getTitle()),
            () -> assertEquals(library.get(0).getAuthors().get(0), book.getAuthors().get(0)),
            () -> assertEquals(library.get(0).getDescription(), book.getDescription(), "Descriptions must match")
        );
    }
/*
    @Test
    void retrieveAbsentBookTest() {
        libraryService.addBook(library.get(0));

        Optional<Book> bookOptional = libraryService.getBookByTitle("Don Quixote");
        assertFalse(bookOptional.isPresent());
    }

    @Test
    void addMultipleBooksTest() {
        library.forEach(libraryService::addBook);

        assertEquals(4, libraryService.getBooks().size());
    }

    @Test
    void addBooksWithDuplicateTest() {
        library.forEach(libraryService::addBook);
        library.forEach(libraryService::addBook);
        assertEquals(8, libraryService.getBooks().size());
    }

    @Test
    void deleteABookTest() {
        library.forEach(libraryService::addBook);

        Book bookToDelete = library.get(2);
        libraryService.deleteBook(bookToDelete);

        List<Book> books = libraryService.getBooks();
        assertEquals(3, books.size());
        assertFalse(books.stream().anyMatch(b -> b.equals(bookToDelete)));
        assertEquals(3, library.stream().filter(books::contains).count());
    }*/
}

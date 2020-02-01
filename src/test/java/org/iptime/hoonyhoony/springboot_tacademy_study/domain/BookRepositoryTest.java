package org.iptime.hoonyhoony.springboot_tacademy_study.domain;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void testSave() {
        Book book = new Book();
        book.setName("Test Book Spring Boot");
        book.setIsbn10("1234567890");
        book.setIsbn13("1234567890123");

        assertThat(book.isNew()).isTrue();

        bookRepository.save(book);

        assertThat(book.isNew()).isFalse();
    }

    @Test
    public void testFindByNameLike() {
        Book book = new Book();
        book.setName("Test-Book-Spring-Boot");
        book.setIsbn10("1234567890");
        book.setIsbn13("1234567890123");
        bookRepository.save(book);

        List<Book> books = bookRepository.findByNameLike("Hoon");
        assertThat(books).isEmpty();

        books = bookRepository.findByNameLike("%Book%");
        assertThat(books).isNotEmpty();

    }
}

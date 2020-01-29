package org.iptime.hoonyhoony.springboot_tacademy_study.domain;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//FIXME : 테스트가안됨 설정 확인
@DataJpaTest
@RunWith(SpringRunner.class)
class BookRepositoryTest {

    @Autowired
    BookRepository repository;

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("Test Book Spring Boot");
        book.setIsbn10("1234567890");
        book.setIsbn13("1234567890123");

        assertThat(book.isNew()).isTrue();

        repository.save(book);

        assertThat(book.isNew()).isFalse();
    }

    @Test
    public void testFindByNameLike(){
        Book book = new Book();
        book.setName("Test Book Spring Boot");
        book.setIsbn10("1234567890");
        book.setIsbn13("1234567890123");

        repository.save(book);
        List<Book> books = repository.findByNameLike("Book");
        assertThat(books).isNotEmpty();

        books = repository.findByNameLike("Hoon");
        assertThat(books).isEmpty();
    }
}

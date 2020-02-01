package org.iptime.hoonyhoony.springboot_tacademy_study.service;

import org.iptime.hoonyhoony.springboot_tacademy_study.domain.Book;
import org.iptime.hoonyhoony.springboot_tacademy_study.domain.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BookServiceTest {

    @Autowired
    BookService bookService;

    @Before
    public void setUp() {
        BookRepository bookRepository = new StubBookRepository();
        bookService = new BookServiceImpl(bookRepository);
    }

    @Test(expected = RuntimeException.class)
    public void testFindById() {
        Long id = 1L;
        Book book = bookService.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public static class StubBookRepository implements BookRepository {

        @Override
        public List<Book> findByNameLike(String name) {
            return null;
        }

        @Override
        public List<Book> findAll() {
            return Collections.emptyList();
        }

        @Override
        public List<Book> findAll(Sort sort) {
            return null;
        }

        @Override
        public Page<Book> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public List<Book> findAllById(Iterable<Long> longs) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(Book entity) {

        }

        @Override
        public void deleteAll(Iterable<? extends Book> entities) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends Book> S save(S entity) {
            return null;
        }

        @Override
        public <S extends Book> List<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public Optional<Book> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends Book> S saveAndFlush(S entity) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<Book> entities) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public Book getOne(Long aLong) {
            return null;
        }

        @Override
        public <S extends Book> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends Book> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends Book> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public <S extends Book> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Book> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends Book> boolean exists(Example<S> example) {
            return false;
        }
    }
}
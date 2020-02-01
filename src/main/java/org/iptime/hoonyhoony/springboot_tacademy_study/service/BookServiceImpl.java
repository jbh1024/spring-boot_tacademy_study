package org.iptime.hoonyhoony.springboot_tacademy_study.service;

import org.iptime.hoonyhoony.springboot_tacademy_study.domain.Book;
import org.iptime.hoonyhoony.springboot_tacademy_study.domain.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }
}

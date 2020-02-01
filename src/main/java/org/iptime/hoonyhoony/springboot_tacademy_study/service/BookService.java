package org.iptime.hoonyhoony.springboot_tacademy_study.service;

import org.iptime.hoonyhoony.springboot_tacademy_study.domain.Book;

import java.util.Optional;

public interface BookService {

    Optional<Book> findById(Long id);

}

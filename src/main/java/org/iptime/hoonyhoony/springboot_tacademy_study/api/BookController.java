package org.iptime.hoonyhoony.springboot_tacademy_study.api;

import org.iptime.hoonyhoony.springboot_tacademy_study.domain.Book;
import org.iptime.hoonyhoony.springboot_tacademy_study.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("{bookId}")
    public ResponseEntity<Book> findById(Long bookId) {
        Book book = bookService.findById(bookId).orElseThrow(() -> new RuntimeException("Not found : " + bookId));
        return ResponseEntity.ok(book);

    }
}

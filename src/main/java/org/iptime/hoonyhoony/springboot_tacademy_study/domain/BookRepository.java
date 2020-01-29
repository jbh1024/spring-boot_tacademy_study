package org.iptime.hoonyhoony.springboot_tacademy_study.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository 는 불필요, Book class에 상속한  AbstractPersistable<Long> 에 포함되어있음.!!
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByNameLike(String name);
}

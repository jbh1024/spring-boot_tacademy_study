package org.iptime.hoonyhoony.springboot_tacademy_study.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book extends AbstractPersistable<Long> {

    private String name;
    private String isbn13;
    private String isbn10;
}

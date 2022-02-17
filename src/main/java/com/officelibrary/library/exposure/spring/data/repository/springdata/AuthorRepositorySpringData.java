package com.officelibrary.library.exposure.spring.data.repository.springdata;

import com.officelibrary.library.exposure.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepositorySpringData extends JpaRepository<Author, Integer> {
}

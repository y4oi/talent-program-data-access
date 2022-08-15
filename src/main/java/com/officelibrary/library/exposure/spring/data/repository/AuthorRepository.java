package com.officelibrary.library.exposure.spring.data.repository;

import java.util.List;

import com.officelibrary.library.exposure.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    public List<Author> findByNameAndSurname(String name, String surname);

    public List<Author> findBySurnameNotContaining(String surname);

    @Query(value = "SELECT * FROM AUTHOR A WHERE LENGTH (A.name) > :minNameLength", nativeQuery = true)
    public List<Author> findByNamesLongerThan(@Param("minNameLength") Integer minNameLength);

}

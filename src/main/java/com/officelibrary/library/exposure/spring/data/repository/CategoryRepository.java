package com.officelibrary.library.exposure.spring.data.repository;

import com.officelibrary.library.exposure.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

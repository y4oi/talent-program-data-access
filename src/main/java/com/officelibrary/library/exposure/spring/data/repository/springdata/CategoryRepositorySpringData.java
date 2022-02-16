package com.officelibrary.library.exposure.spring.data.repository.springdata;

import com.officelibrary.library.exposure.model.Category;
import com.officelibrary.library.exposure.spring.data.repository.CategoryRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositorySpringData extends CategoryRepository, JpaRepository<Category, Integer> {

}

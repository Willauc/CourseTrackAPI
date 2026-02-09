package com.willauc.coursetrackapi.repositories;

import com.willauc.coursetrackapi.entities.Categories;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Categories, Long> {
}

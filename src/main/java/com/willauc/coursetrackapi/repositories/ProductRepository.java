package com.willauc.coursetrackapi.repositories;

import com.willauc.coursetrackapi.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

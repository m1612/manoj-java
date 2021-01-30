package com.manoj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.model.Product;

public interface ProductRepo extends
                         JpaRepository<Product, Integer> {

}

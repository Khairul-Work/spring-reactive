package com.example.samplereactive.repository;

import com.example.samplereactive.entity.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends R2dbcRepository<Product, Integer> {
}

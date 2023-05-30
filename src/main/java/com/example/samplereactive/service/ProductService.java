package com.example.samplereactive.service;

import com.example.samplereactive.entity.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.Serial;

public interface ProductService {
    public Mono<Product> addProduct(Product product);
    public Mono<Product> getProductById(Integer id);
    public Mono<Product> updateProduct(Product product);
    public Mono<Void> deleteProduct(Integer id);
    public Flux<Product> getAllProduct();
}



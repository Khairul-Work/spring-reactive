package com.example.samplereactive.service;

import com.example.samplereactive.entity.Product;
import com.example.samplereactive.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Mono<Product> addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Mono<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public Mono<Product> updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Mono<Void> deleteProduct(Integer id) {
        return productRepository.deleteById(id);
    }

    @Override
    public Flux<Product> getAllProduct() {
        return productRepository.findAll();
    }

}

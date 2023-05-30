package com.example.samplereactive.controller;

import com.example.samplereactive.entity.Product;
import com.example.samplereactive.service.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Mono<Product> addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/{id}")
    public Mono<Product> getProduct(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public Flux<Product> getAllProduct() {
        return productService.getAllProduct();
    }
}

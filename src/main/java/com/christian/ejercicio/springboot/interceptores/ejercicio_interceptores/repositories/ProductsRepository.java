package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models.domain.Product;

public interface ProductsRepository {

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product postProduct(@RequestBody Product product);

}

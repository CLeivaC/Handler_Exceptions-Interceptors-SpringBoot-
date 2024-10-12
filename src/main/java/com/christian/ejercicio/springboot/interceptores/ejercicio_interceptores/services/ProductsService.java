package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models.domain.Product;

public interface ProductsService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product postProduct(@RequestBody Product product);

}

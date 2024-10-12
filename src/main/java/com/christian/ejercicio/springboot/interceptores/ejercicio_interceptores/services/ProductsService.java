package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.services;

import java.util.List;

import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models.domain.Product;

public interface ProductsService {

    List<Product> getAllProducts();
    Product getProductById(Long id);

}

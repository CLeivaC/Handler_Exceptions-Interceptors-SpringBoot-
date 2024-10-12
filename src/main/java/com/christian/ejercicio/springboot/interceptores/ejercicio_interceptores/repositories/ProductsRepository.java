package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.repositories;

import java.util.List;
import java.util.Optional;

import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models.domain.Product;

public interface ProductsRepository {



    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);

}

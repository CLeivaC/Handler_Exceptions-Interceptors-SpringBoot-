package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models.domain.Product;
import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.services.ProductsService;

@RestController
@RequestMapping("/app/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;


    @GetMapping
    public List<Product> getAllProducts(){
        return productsService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productsService.getProductById(id);
    }

}

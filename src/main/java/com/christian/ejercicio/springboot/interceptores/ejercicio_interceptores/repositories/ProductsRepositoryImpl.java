package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models.domain.Product;

@Repository
public class ProductsRepositoryImpl implements ProductsRepository{

    List<Product> listProducts;

    

    public ProductsRepositoryImpl() {
        this.listProducts = new ArrayList<>();
        this.listProducts.add(new Product(1L, "TV TLC 50", "Electronic"));
        this.listProducts.add(new Product(2L, "Iphone 15 PRO MAX", "Mobiles"));
        this.listProducts.add(new Product(3L, "PS5", "Consoles"));
        this.listProducts.add(new Product(4L, "Fridge", "Electrodomestics"));


    }

    @Override
    public List<Product> getAllProducts() {
       return listProducts;
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return listProducts.stream().filter(p-> p.getId().equals(id)).findFirst();
    }

    @Override
    public Product postProduct(@RequestBody Product product) {
        listProducts.add(product );
        return product;
    }

}

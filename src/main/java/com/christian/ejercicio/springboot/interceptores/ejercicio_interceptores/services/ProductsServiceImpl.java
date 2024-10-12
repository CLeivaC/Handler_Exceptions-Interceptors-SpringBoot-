package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.exceptions.ProductNotFoundException;
import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models.domain.Product;
import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.repositories.ProductsRepository;

@Service
public class ProductsServiceImpl implements ProductsService{

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Product> getAllProducts() {
       return productsRepository.getAllProducts();
    }

    @Override
    public Product getProductById(Long id) {
       return productsRepository.getProductById(id).orElseThrow(()->new ProductNotFoundException("Producto no encontrado con id: " +id));
    }

   @Override
   public Product postProduct(@RequestBody Product product) {
      return productsRepository.postProduct(product);
   }

}

package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.controllers;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.exceptions.ProductNotFoundException;
import com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models.Error;

@RestControllerAdvice
public class HandlerExceptions {

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFoundEx(Exception e){
       Error error = new Error();
       error.setMessage("Esta ruta no existe en la api");
       error.setDate(new Date());
       error.setError(e.getMessage());
       error.setStatus(HttpStatus.NOT_FOUND.value());

       return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<Error> productNotFoundEx(ProductNotFoundException e){
        Error error = new Error();
        error.setMessage("El producto no existe");
        error.setDate(new Date());
        error.setError(e.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

}

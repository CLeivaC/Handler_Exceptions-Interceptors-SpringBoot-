package com.christian.ejercicio.springboot.interceptores.ejercicio_interceptores.models;

import java.util.Date;

public class Error {

    private String message;
    private Date date;
    private String error;
    private int status;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    

}

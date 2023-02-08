package com.lucascastro.cities_api_nearby_ddd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DDDNotFoundException extends Exception {

    public DDDNotFoundException(Integer ddd)
    {
        super(String.format("DDD with %s not found!", ddd));
    }
}
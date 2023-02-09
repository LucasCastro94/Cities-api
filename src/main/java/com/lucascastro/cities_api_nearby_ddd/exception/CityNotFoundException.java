package com.lucascastro.cities_api_nearby_ddd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CityNotFoundException extends Exception{
    public CityNotFoundException()
    {
        super(String.format("One or both of the cities were not found!"));
    }
}

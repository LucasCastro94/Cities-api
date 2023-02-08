package com.lucascastro.cities_api_nearby_ddd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //informar o response da pagina como não encontrado
public class StateNotFoundException extends Exception {

    public StateNotFoundException(Integer ddd) {
        super(String.format("DDD with %s not found!", ddd));
    }
}
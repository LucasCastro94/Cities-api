package com.lucascastro.cities_api_nearby_ddd.states.controller;

import com.lucascastro.cities_api_nearby_ddd.exception.DDDNotFoundException;
import com.lucascastro.cities_api_nearby_ddd.states.service.ServiceState;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("ddd")
public class StateDDDCodeController
{
    ServiceState service;

    @GetMapping("/{ddd}")
    @ResponseStatus(HttpStatus.OK)
    public String dddCode(@PathVariable int ddd) throws DDDNotFoundException
    {
      return service.findDDD(ddd);
    }

}
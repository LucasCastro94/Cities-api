package com.lucascastro.cities_api_nearby_ddd.cities.controller;


import com.lucascastro.cities_api_nearby_ddd.cities.entities.City;
import com.lucascastro.cities_api_nearby_ddd.cities.service.DistanceService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/nearby")
public class NearbyController {

  private final DistanceService service;

  @GetMapping
  public List<City> nearby(@RequestParam(name = "city_id") final Long cityId,@RequestParam(name = "radius") final Double radius)
  {
    return service.nearby(cityId, radius);
  }
}

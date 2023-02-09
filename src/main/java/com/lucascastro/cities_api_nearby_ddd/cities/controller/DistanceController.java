package com.lucascastro.cities_api_nearby_ddd.cities.controller;

import com.lucascastro.cities_api_nearby_ddd.cities.service.DistanceService;
import com.lucascastro.cities_api_nearby_ddd.exception.CityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/distances")
public class DistanceController {
  private final DistanceService service;

  @ResponseStatus(HttpStatus.OK)
  @GetMapping
  public Double byCube(@RequestParam(name = "from") final Long city1,@RequestParam(name = "to") final Long city2) throws CityNotFoundException
  {
    return service.distanceByCubeInMeters(city1, city2);
  }

}

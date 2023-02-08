package com.lucascastro.cities_api_nearby_ddd.cities.controller;

import com.lucascastro.cities_api_nearby_ddd.cities.service.DistanceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//controller

/*
   OBS: esses subResources by-ponts, by-cube e math fogem do padrão REST o rest seria apenas 1 exemplo /distance?... retorna distancia
 */
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/distances")
public class DistanceController {

  private final DistanceService service;

  //Cube
  @GetMapping//distances?from=id&to=id
  public Double byCube(@RequestParam(name = "from") final Long city1,@RequestParam(name = "to") final Long city2)
  {
    return service.distanceByCubeInMeters(city1, city2);
  }

}

package com.lucascastro.cities_api_nearby_ddd.cities.controller;

import com.lucascastro.cities_api_nearby_ddd.cities.entities.City;
import com.lucascastro.cities_api_nearby_ddd.cities.repositories.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("cities")
public class CityController{

  private final CityRepository repository;

  @GetMapping
  public Page<City> cities(final Pageable page)
  {
    return repository.findAll(page);
  }
}

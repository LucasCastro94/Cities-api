package com.lucascastro.cities_api_nearby_ddd.countries.controller;

import com.lucascastro.cities_api_nearby_ddd.countries.entities.Country;
import com.lucascastro.cities_api_nearby_ddd.countries.repositories.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("countries")
public class CountryController {

  private final CountryRepository repository;

  @GetMapping
  public Page<Country> countries(final Pageable page) {
    return repository.findAll(page);
  }
}


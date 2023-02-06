package com.lucascastro.cities_api_nearby_ddd.states.controller;


import com.lucascastro.cities_api_nearby_ddd.states.entities.State;
import com.lucascastro.cities_api_nearby_ddd.states.repositories.StateRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("states")
public class StateController {
  private final StateRepository repository;

  @GetMapping
  public Page<State> states(final Pageable page)
  {
    return repository.findAll(page);
  }
}

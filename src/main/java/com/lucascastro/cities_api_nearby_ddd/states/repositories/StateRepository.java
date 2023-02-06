package com.lucascastro.cities_api_nearby_ddd.states.repositories;

import com.lucascastro.cities_api_nearby_ddd.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

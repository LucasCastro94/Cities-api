package com.lucascastro.cities_api_nearby_ddd.states.service;

import com.lucascastro.cities_api_nearby_ddd.exception.DDDNotFoundException;
import com.lucascastro.cities_api_nearby_ddd.states.entities.State;
import com.lucascastro.cities_api_nearby_ddd.states.repositories.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ServiceState {

    private final StateRepository repository;

    public String findDDD(final Integer ddd) throws DDDNotFoundException
    {
        List<State> states = repository.findAll();
        String stateName = states.stream()
                .filter(state -> state.getDdd() != null && state.getDdd().contains(ddd))
                .map(State::getName)
                .findFirst()
                .orElseThrow(() -> new DDDNotFoundException(ddd));
                return stateName;

    }

}

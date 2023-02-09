package com.lucascastro.cities_api_nearby_ddd.cities.service;

import com.lucascastro.cities_api_nearby_ddd.cities.entities.City;
import com.lucascastro.cities_api_nearby_ddd.cities.repositories.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class NearbyService {

    private final CityRepository cityRepository;

    public List<City> nearby(Long id, Double radius)
    {
        Optional<City> city = cityRepository.findById(id);

        if (city.isPresent())
        {
            Point location = city.get().getLocation();
            return cityRepository.citiesByRadius(location.getX(), location.getY(), radius);
        }

        return Collections.emptyList();
    }

}

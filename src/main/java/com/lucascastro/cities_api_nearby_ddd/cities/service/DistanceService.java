package com.lucascastro.cities_api_nearby_ddd.cities.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.lucascastro.cities_api_nearby_ddd.cities.entities.City;
import com.lucascastro.cities_api_nearby_ddd.cities.repositories.CityRepository;
import com.lucascastro.cities_api_nearby_ddd.exception.CityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceService {

  private final CityRepository cityRepository; // utiliza o repositorio cidade

  public Double distanceByCubeInMeters(Long city1, Long city2) throws CityNotFoundException {
    final List<City> cities = cityRepository.findAllById(Arrays.asList(city1, city2));
    if (cities.size() != 2) throw new CityNotFoundException();
    Point p1 = cities.get(0).getLocation();
    Point p2 = cities.get(1).getLocation();

    return cityRepository.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());
  }


}

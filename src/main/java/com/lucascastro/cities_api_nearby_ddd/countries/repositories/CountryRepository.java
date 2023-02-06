package com.lucascastro.cities_api_nearby_ddd.countries.repositories;

import com.lucascastro.cities_api_nearby_ddd.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

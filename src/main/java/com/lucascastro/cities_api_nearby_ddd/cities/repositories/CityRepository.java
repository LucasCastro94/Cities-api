package com.lucascastro.cities_api_nearby_ddd.cities.repositories;

import com.lucascastro.cities_api_nearby_ddd.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {


  String QUERY_CUBE = "SELECT earth_distance(ll_to_earth(?1,?2), ll_to_earth(?3,?4)) as distance";

  String QUERY_RADIUS_AREA = "SELECT * FROM cidade as c "
      + "WHERE earth_box(ll_to_earth(?1, ?2), ?3) @> ll_to_earth(c.lat_lon[0], c.lat_lon[1]) "
      + "AND earth_distance(ll_to_earth(?1, ?2), ll_to_earth(c.lat_lon[0], c.lat_lon[1])) < ?3";

  @Query(value = QUERY_CUBE, nativeQuery = true)
  Double distanceByCube(final Double lat1, final Double lon1, final Double lat2, final Double lon2);

  @Query(value = QUERY_RADIUS_AREA, nativeQuery = true)
  List<City> citiesByRadius(final double lat, final double lon, final double radius);
}

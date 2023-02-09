
package com.lucascastro.cities_api_nearby_ddd.cities.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "cidade")

public class City {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  private Integer uf;

  private Integer ibge;

  @Column(name = "lat_lon")
  private String geolocation;

  @Convert(converter = ConvertPoint.class)
  @Column(name = "lat_lon", updatable = false, insertable = false)
  private Point location;

}

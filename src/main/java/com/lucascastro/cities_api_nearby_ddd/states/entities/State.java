package com.lucascastro.cities_api_nearby_ddd.states.entities;


import com.lucascastro.cities_api_nearby_ddd.countries.entities.Country;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "State")
@Table(name = "estado")
public class State {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  private String uf;

  private Integer ibge;

  @ManyToOne
  @JoinColumn(name = "pais", referencedColumnName = "id")
  private Country country;

  @JdbcTypeCode(SqlTypes.JSON)
  @Basic(fetch = FetchType.LAZY)
  @Column(name = "ddd", columnDefinition = "jsonb")
  private List<Integer> ddd;



}

package com.lucascastro.cities_api_nearby_ddd.countries.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


//Mapea as variaveis com as informações do banco de dados da tabela pais

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "Country")
@Table(name = "pais")
public class Country {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  @Column(name = "nome_pt")
  private String portugueseName;

  @Column(name = "sigla")
  private String code;

  private Integer bacen;

}

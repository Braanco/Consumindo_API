package br.com.fipe.demo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Veiculos(@JsonAlias("Valor") String valor,
                       @JsonAlias("Marca") String marca,
                       @JsonAlias("Modelo") String modelo,
                       @JsonAlias("AnoModelo") Integer ano,
                       @JsonAlias("Combustivel") String tipoCombustivel) {
}

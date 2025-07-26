package com.aluracursos.desafio_literatura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Embeddable;

@Embeddable
public record DatosAutor(@JsonAlias("name") String nombre,
                         @JsonAlias("birth_year") String fechaDeNacimiento) {
    
    public DatosAutor {
        if (nombre == null) {
            nombre = "Desconocido";
        }
        if (fechaDeNacimiento == null) {
            fechaDeNacimiento = "Fecha desconocida";
        }
    }
}

package com.aluracursos.desafio_literatura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "datos_libros")

public record DatosLibros(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        @Column(unique = true)
        String titulo,
        List<DatosAutor> autor,
        List<String> idiomas,
        Double numeroDeDescargas
) {
}

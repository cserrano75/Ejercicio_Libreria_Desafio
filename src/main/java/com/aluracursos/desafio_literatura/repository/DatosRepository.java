package com.aluracursos.desafio_literatura.repository;

import com.aluracursos.desafio_literatura.model.Datos;
import com.aluracursos.desafio_literatura.model.DatosLibros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosRepository extends JpaRepository <DatosLibros,Long> {


}

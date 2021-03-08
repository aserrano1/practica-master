package com.practica.master.models.service;

import com.prueba.commons.proyecto.models.entity.Pais;

import java.util.List;

public interface IPaisService {
    List<Pais> findByAll();

    Pais findById(Long id);

    Pais crear(Pais Pais) ;

    Pais editar(Long id, Pais Pais);

    void delete(Long id);

    Pais findByNameIgnoreCaseContaining(String name);

}

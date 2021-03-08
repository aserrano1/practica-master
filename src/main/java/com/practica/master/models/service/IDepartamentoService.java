package com.practica.master.models.service;

import com.prueba.commons.proyecto.models.entity.Departamento;
import com.prueba.commons.proyecto.models.entity.Pais;

import java.util.List;

public interface IDepartamentoService {
    List<Departamento> findByAll();

    Departamento findById(Long id);

    Departamento crear(Departamento Departamento) ;

    Departamento editar(Long id, Departamento Departamento);

    void delete(Long id);

    Departamento findByNameIgnoreCaseContaining(String name);

    List<Departamento> findByPais(Pais p);
}

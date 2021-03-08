package com.practica.master.models.service;

import com.prueba.commons.proyecto.models.entity.Ciudad;
import com.prueba.commons.proyecto.models.entity.Departamento;

import java.util.List;

public interface ICiudadService {
    List<Ciudad> findByAll();

    Ciudad findById(Long id);

    Ciudad crear(Ciudad Ciudad) ;

    Ciudad editar(Long id, Ciudad Ciudad);

    void delete(Long id);

    Ciudad findByNameIgnoreCaseContaining(String name);

    List<Ciudad> findByDepartamento(Departamento departamento);

}

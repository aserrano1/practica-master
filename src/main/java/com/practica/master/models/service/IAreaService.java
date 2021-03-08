package com.practica.master.models.service;

import com.prueba.commons.proyecto.models.entity.Area;

import java.util.List;

public interface IAreaService{

    List<Area> findByAll();

    Area findById(Long id);

    Area crear(Area area) ;

    Area editar(Long id, Area area);

    void delete(Long id);

    Area estado(Long id, Boolean estado);

}

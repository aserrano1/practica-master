package com.practica.master.models.dao;

import com.prueba.commons.proyecto.models.entity.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAreaDAO extends CrudRepository<Area,Long> {
}

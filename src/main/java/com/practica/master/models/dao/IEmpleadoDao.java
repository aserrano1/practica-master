package com.practica.master.models.dao;

import com.prueba.commons.proyecto.models.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoDao extends CrudRepository<Empleado,Long> {
}

package com.practica.master.models.dao;

import com.prueba.commons.proyecto.models.entity.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaDao extends CrudRepository<Empresa, Long> {
}

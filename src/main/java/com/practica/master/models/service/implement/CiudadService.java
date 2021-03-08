package com.practica.master.models.service.implement;

import com.practica.master.models.dao.ICiudadDAO;
import com.practica.master.models.service.ICiudadService;
import com.prueba.commons.proyecto.models.entity.Ciudad;
import com.prueba.commons.proyecto.models.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadService implements ICiudadService {

    @Autowired
    private ICiudadDAO dao;

    private Ciudad ciudad;

    @Override
    public List<Ciudad> findByAll() {
        return (List<Ciudad>) dao.findAll();
    }

    @Override
    public Ciudad findById(Long id) {
        ciudad = dao.findById(id).orElse(null);
        return ciudad;
    }

    @Override
    public Ciudad crear(Ciudad ciudad) {
        return dao.save(ciudad);
    }

    @Override
    public Ciudad editar(Long id, Ciudad city) {
        ciudad = findById(id);
        ciudad.setDepartamento(city.getDepartamento());
        ciudad.setName(city.getName());
        return dao.save(ciudad);
    }

    @Override
    public void delete(Long id) {
        ciudad = findById(id);
        dao.delete(ciudad);
    }

    @Override
    public Ciudad findByNameIgnoreCaseContaining(String name) {
        ciudad = dao.findByNameIgnoreCaseContaining(name);
        return ciudad;
    }

    @Override
    public List<Ciudad> findByDepartamento(Departamento d) {
        return (List<Ciudad>) dao.findByDepartamento(d);
    }
}

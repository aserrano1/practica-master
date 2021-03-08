package com.practica.master.models.service.implement;

import com.practica.master.models.dao.IDepartamentoDAO;
import com.practica.master.models.service.IDepartamentoService;
import com.prueba.commons.proyecto.models.entity.Departamento;
import com.prueba.commons.proyecto.models.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService implements IDepartamentoService {

    @Autowired
    private IDepartamentoDAO dao;

    private Departamento departamento;
    
    @Override
    public List<Departamento> findByAll() {
        return (List<Departamento>) dao.findAll();
    }

    @Override
    public Departamento findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Departamento crear(Departamento Departamento) {
        return dao.save(Departamento);
    }

    @Override
    public Departamento editar(Long id, Departamento departament) {
        departamento = findById(id);
        departamento.setName(departament.getName());
        departamento.setPais(departament.getPais());
        
        return dao.save(departamento);
    }

    @Override
    public void delete(Long id) {
        departamento = findById(id);
        dao.delete(departamento);
    }

    @Override
    public Departamento findByNameIgnoreCaseContaining(String name) {
        departamento = dao.findByNameIgnoreCaseContaining(name);
        return departamento;
    }

    @Override
    public List<Departamento> findByPais(Pais p) {
        return (List<Departamento>) dao.findByPais(p);    }
}

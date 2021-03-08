package com.practica.master.models.service.implement;

import com.practica.master.models.dao.IPaisDAO;
import com.practica.master.models.service.IPaisService;
import com.prueba.commons.proyecto.models.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService implements IPaisService {
    @Autowired
    private IPaisDAO dao;

    private Pais pais;

    @Override
    public List<Pais> findByAll() {
        return (List<Pais>) dao.findAll();
    }

    @Override
    public Pais findById(Long id) {
        pais = dao.findById(id).orElse(null);
        return pais;
    }

    @Override
    public Pais crear(Pais p) {
        return dao.save(p);
    }

    @Override
    public Pais editar(Long id, Pais Pais) {
        pais = findById(id);
       pais.setName(Pais.getName());
        return dao.save(pais);
    }

    @Override
    public void delete(Long id) {
        pais = findById(id);
        dao.delete(pais);
    }

    @Override
    public Pais findByNameIgnoreCaseContaining(String name) {
        pais = dao.findByNameIgnoreCaseContaining(name);
        return pais;
    }
}

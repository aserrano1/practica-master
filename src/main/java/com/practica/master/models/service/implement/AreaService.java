package com.practica.master.models.service.implement;

import com.practica.master.models.dao.IAreaDAO;
import com.practica.master.models.service.IAreaService;
import com.prueba.commons.proyecto.models.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService implements IAreaService {

    @Autowired
    private IAreaDAO dao;

    private Area area;


    @Override
    public List<Area> findByAll() {
        return (List<Area>) dao.findAll();
    }

    @Override
    public List<Area> findByEstado(Boolean estado) {
        return (List<Area>) dao.findByEstado(estado);
    }

    @Override
    public Area findById(Long id) {
        area = dao.findById(id).orElse(null);
        return area;
    }

    @Override
    public Area crear(Area area) {
        return dao.save(area);
    }

    @Override
    public Area editar(Long id, Area area) {
        this.area = findById(id);
        this.area.setEstado(area.getEstado());
        this.area.setDescripcion(area.getDescripcion());
        this.area.setDiasVacaciones(area.getDiasVacaciones());
        this.area.setCuentaNominaPorPagar(area.getCuentaNominaPorPagar());
        this.area.setPrefijoContable(area.getPrefijoContable());

        return dao.save(this.area);
    }

    @Override
    public void delete(Long id) {
        area = findById(id);
        dao.delete(area);
    }

    @Override
    public Area estado(Long id, Boolean estado) {
        area = findById(id);
        area.setEstado(estado);
        return dao.save(area);
    }
}

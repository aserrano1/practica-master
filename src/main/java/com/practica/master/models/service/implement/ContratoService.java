package com.practica.master.models.service.implement;

import com.practica.master.models.service.IContratoService;
import com.prueba.commons.proyecto.models.entity.Contrato;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoService implements IContratoService {
    @Override
    public List<Contrato> findByAll() {
        return null;
    }

    @Override
    public Contrato findById(Long id) {
        return null;
    }

    @Override
    public Contrato crear(Contrato Contrato) {
        return null;
    }

    @Override
    public Contrato editar(Long id, Contrato Contrato) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Contrato findByCodigoIgnoreCaseContaining(String name) {
        return null;
    }

    @Override
    public List<Contrato> findByArea(Contrato contrato) {
        return null;
    }

    @Override
    public List<Contrato> findByValor_Salario(Contrato contrato) {
        return null;
    }
}

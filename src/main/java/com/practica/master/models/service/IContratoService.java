package com.practica.master.models.service;

import com.prueba.commons.proyecto.models.entity.Contrato;

import java.util.List;

public interface IContratoService {

    List<Contrato> findByAll();

    Contrato findById(Long id);

    Contrato crear(Contrato Contrato) ;

    Contrato editar(Long id, Contrato Contrato);

    void delete(Long id);

    Contrato findByCodigoIgnoreCaseContaining(String name);

    List<Contrato> findByArea(Contrato contrato);

    List<Contrato> findByValor_Salario(Contrato contrato);

}

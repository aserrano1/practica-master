package com.practica.master.models.service;


import com.practica.master.exception.exceptions.TrainingResourceNoExistsException;
import com.practica.master.exception.exceptions.TrainingResourceNotFoundException;
import com.prueba.commons.proyecto.models.entity.TipoReferencia;

import java.util.List;

public interface ITiporeferenciaServices {

    List<TipoReferencia> findByAll();

    TipoReferencia findById(Long id) throws TrainingResourceNotFoundException;

    TipoReferencia create(TipoReferencia TipoReferencia) throws TrainingResourceNoExistsException;

    TipoReferencia edit(Long id, TipoReferencia tipoReferencia) throws Exception;

    void delete(Long id) throws  TrainingResourceNoExistsException;





}

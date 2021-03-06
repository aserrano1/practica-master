package com.practica.master.model;

import com.prueba.commons.proyecto.entity.Fondo;
import com.prueba.commons.proyecto.entity.TipoReferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoReferenciaServicio {

    @Autowired
    TipoReferencia tipoReferencia;

    @Autowired
    Fondo fondo;
}

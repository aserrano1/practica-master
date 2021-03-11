package com.practica.master.controller;

import com.practica.master.exception.exceptions.TrainingResourceNoExistsException;
import com.practica.master.exception.exceptions.TrainingResourceNotFoundException;
import com.practica.master.models.service.implement.TipoReferenciaService;
import com.prueba.commons.proyecto.models.entity.TipoReferencia;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tipoReferencia")
public class TipoReferenciaController {
    @Autowired
    TipoReferenciaService tipoReferenciaService;

    @GetMapping("/listarTipoReferencias")
    public List<TipoReferencia> listarTipoReferencia() {
        return tipoReferenciaService.findByAll();
    }
    @GetMapping("/verTipoReferencia/{id}")
    public TipoReferencia findByNombre(@PathVariable Long id) throws TrainingResourceNotFoundException {
        return tipoReferenciaService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/createTipoReferencia")
    public TipoReferencia createTipoReferencia(@RequestBody TipoReferencia tipoReferencia) throws Exception {
        return tipoReferenciaService.create(tipoReferencia);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/editTipoReferencia/{id}")
    public TipoReferencia editTipoReferencia(@PathVariable Long id, @RequestBody TipoReferencia tipoReferencia) throws Exception {
        return tipoReferenciaService.edit(id, tipoReferencia);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/deleteTipoReferencia/{id}")
    public void deleteTipoReferencia(@PathVariable Long id) throws TrainingResourceNoExistsException {
        tipoReferenciaService.delete(id);
    }




}

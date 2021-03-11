package com.practica.master.models.service.implement;

import com.practica.master.exception.exceptions.TrainingResourceDeletedException;
import com.practica.master.exception.exceptions.TrainingResourceNoExistsException;
import com.practica.master.exception.exceptions.TrainingResourceNoUpdateException;
import com.practica.master.exception.exceptions.TrainingResourceNotFoundException;
import com.practica.master.models.dao.ITipoReferenciaDao;
import com.practica.master.models.service.ITiporeferenciaServices;

import com.prueba.commons.proyecto.models.entity.TipoReferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoReferenciaService implements ITiporeferenciaServices {
    @Autowired
    private ITipoReferenciaDao tipoReferenciaDao;


    @Override
    @Transactional(readOnly = true)
    public List<TipoReferencia> findByAll() {
        return (List<TipoReferencia>) tipoReferenciaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoReferencia create(TipoReferencia tipoReferencia) throws TrainingResourceNoExistsException {

       return tipoReferenciaDao.save(tipoReferencia);

    }

    @Override
    public TipoReferencia edit(Long id, TipoReferencia tipoReferencia) throws Exception {

        TipoReferencia tipoRef = tipoReferenciaDao.findById(id).orElse(null);

        if (tipoRef == null) {
            throw new TrainingResourceNotFoundException("El tipo de referencia " + id + " no existe");
        }

        try {

            tipoRef.setDescripcion(tipoReferencia.getDescripcion());
            tipoRef.setDetalleTipoReferencia(tipoReferencia.getDetalleTipoReferencia());
            tipoRef.setEstado(tipoReferencia.getEstado());


            return tipoReferenciaDao.save(tipoRef);
        } catch (DataIntegrityViolationException e) {
            throw new TrainingResourceNoUpdateException(" No ha sido posible actualizar el tipo de referencia. ");
        }

    }

    @Override
    public void delete(Long id) throws TrainingResourceNoExistsException {
        try {
            tipoReferenciaDao.deleteById(id);
        }catch (Exception e){
            throw new TrainingResourceNoExistsException("NO se encuentra el tipo de referencia");
        }

    }


    @Override
    public TipoReferencia findById(Long id) throws TrainingResourceNotFoundException {
        TipoReferencia tipoReferencia = tipoReferenciaDao.findById(id).orElse(null);
        if (tipoReferencia == null) {
            throw new TrainingResourceNotFoundException("El tipo de referencia no se encuentra ");
        }
        return tipoReferencia;

    }
}

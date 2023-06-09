package com.grupo9.tpintegrador.controllers.implementations;

import com.grupo9.tpintegrador.controllers.interfaces.IEspacioFisicoController;
import com.grupo9.tpintegrador.controllers.requests.espacios.SaveEspacioFisicoRequest;
import com.grupo9.tpintegrador.data.models.EspacioFisico;
import com.grupo9.tpintegrador.services.interfaces.IEspacioFisicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin
public class EspacioFisicoController implements IEspacioFisicoController {

    @Autowired
    IEspacioFisicoService espacioFisicoService;

    @Override
    public EspacioFisico saveEspacioFisico(SaveEspacioFisicoRequest request) {
        return espacioFisicoService.saveEspacioFisico(request);
    }

    @Override
    public Page<EspacioFisico> getEspaciosFisicos(int page, int size) {
        return espacioFisicoService.getEspaciosFisicos(page, size);
    }

    @Override
    public Page<EspacioFisico> getEspaciosFisicosByNombreAndCapacidad(String nombre, int capacidad, int page, int size) {
        return espacioFisicoService.getEspaciosFisicosByNombreAndCapacidad(nombre, capacidad, page, size);
    }

    @Override
    public Page<EspacioFisico> getEspaciosFisicosByNombre(String nombre, int page, int size) {
        return espacioFisicoService.getEspaciosFisicosByNombre(nombre, page, size);
    }

    @Override
    public Page<EspacioFisico> getEspaciosFisicosByCapacidad(int capacidad, int page, int size) {
        return espacioFisicoService.getEspaciosFisicosByCapacidad(capacidad, page, size);
    }

    @Override
    public EspacioFisico getEspacioFisico(String id) {
        return espacioFisicoService.getEspacioFisico(id);
    }

    @Override
    public String deleteEspacioFisico(String id) {
        return espacioFisicoService.deleteEspacioFisico(id);
    }

    @Override
    public EspacioFisico updateEspacioFisico(EspacioFisico espacioFisico, String id) {
        return espacioFisicoService.updateEspacioFisico(espacioFisico, id);
    }

    @Override
    public void addRecurso(String espacioId, String recursoId) {
        espacioFisicoService.addRecurso(espacioId, recursoId);
    }

    @Override
    public void removeRecurso(String espacioId, String recursoId) {
        espacioFisicoService.removeRecurso(espacioId, recursoId);
    }
}

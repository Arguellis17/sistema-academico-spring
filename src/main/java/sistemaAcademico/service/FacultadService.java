package sistemaAcademico.service;

import sistemaAcademico.model.Facultad;

import java.util.List;

public interface FacultadService extends CrudService<Facultad, Long>{
    public List<Facultad> findByNombre(String nombre);
}

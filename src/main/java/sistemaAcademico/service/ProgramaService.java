package sistemaAcademico.service;

import sistemaAcademico.model.Programa;

import java.util.List;

public interface ProgramaService extends CrudService<Programa, Long>{
    public List<Programa> findByNombre(String nombre);

    public List<Programa> findByDescripcion(String descripcion);
}

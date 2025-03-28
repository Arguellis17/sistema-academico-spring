package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Programa;

@Service
public interface ProgramaService extends CrudService<Programa, Long>{
   /* public List<Programa> findByNombre(String nombre);

    public List<Programa> findByDescripcion(String descripcion);*/
}

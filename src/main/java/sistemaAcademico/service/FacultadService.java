package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Facultad;

import java.util.List;

@Service
public interface FacultadService extends CrudService<Facultad, Long>{
    public List<Facultad> findByNombre(String nombre);
}

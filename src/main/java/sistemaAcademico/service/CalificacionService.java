package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Calificacion;

@Service
public interface CalificacionService extends CrudService<Calificacion, Long> {

    //public List<Calificacion> findByNota(float nota);

}

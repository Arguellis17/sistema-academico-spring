package sistemaAcademico.service;

import sistemaAcademico.model.Calificacion;
import java.util.List;

public interface CalificacionService extends CrudService<Calificacion, Long> {

    //public List<Calificacion> findByNota(float nota);
    List<Calificacion> findByNota(float nota);
}

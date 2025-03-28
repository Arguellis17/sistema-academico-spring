package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.CursoHistorial;

@Service
public interface CursoHistorialService extends CrudService<CursoHistorial, Long> {

    //public List<CursoHistorial> findByCalificacionFinal(float calificacionFinal);
}

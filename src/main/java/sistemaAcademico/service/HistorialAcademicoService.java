package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.HistorialAcademico;

@Service
public interface HistorialAcademicoService extends CrudService<HistorialAcademico, Long> {

    //public List<HistorialAcademico> findByPromedioGeneral(float promedioGeneral);
}

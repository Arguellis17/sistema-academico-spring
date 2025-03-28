package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Asistencia;

@Service
public interface AsistenciaService extends CrudService<Asistencia, Long> {

    //public List<Asistencia> findByFechaAsistencia(Date fechaAsistencia);
    //public List<Asistencia> findByAsistencia(boolean asistencia);
}

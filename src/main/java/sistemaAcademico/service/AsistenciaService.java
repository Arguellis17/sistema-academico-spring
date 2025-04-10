package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Asistencia;

import java.util.Date;
import java.util.List;

@Service
public interface AsistenciaService extends CrudService<Asistencia, Long> {

    //public List<Asistencia> findByFechaAsistencia(Date fechaAsistencia);
    //public List<Asistencia> findByAsistencia(boolean asistencia);

    List<Asistencia> findByFechaAsistencia(Date fechaAsistencia);
    //List<Asistencia> findByAsistencia(boolean asistencia);

    List<Asistencia> findByAsistencia(boolean asistencia);
}

package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Estudiante;

@Service
public interface EstudianteService extends CrudService <Estudiante, Long>{
    /*// Buscar estudiantes por código de carrera
    List<Estudiante> findByCodigoCarreraCodigoCarrera(Long codigoCarrera);

    // Buscar estudiantes por semestre
    List<Estudiante> findBySemestre(int semestre);*/
}

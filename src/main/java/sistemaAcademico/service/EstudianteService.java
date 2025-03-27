package sistemaAcademico.service;

import sistemaAcademico.model.Estudiante;

import java.util.List;

public interface EstudianteService extends CrudService <Estudiante, Long>{
    // Buscar estudiantes por código de carrera
    List<Estudiante> findByCodigoCarreraCodigoCarrera(Long codigoCarrera);

    // Buscar estudiantes por semestre
    List<Estudiante> findBySemestre(int semestre);
}

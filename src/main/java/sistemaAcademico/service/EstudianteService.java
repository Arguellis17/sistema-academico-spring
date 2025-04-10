package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Estudiante;

import java.util.List;

@Service
public interface EstudianteService extends CrudService <Estudiante, Long>{
    /*// Buscar estudiantes por código de carrera
    List<Estudiante> findByCodigoCarreraCodigoCarrera(Long codigoCarrera);

    // Buscar estudiantes por semestre
    List<Estudiante> findBySemestre(int semestre);*/
    List<Estudiante> findByNombre(String nombre);

    List<Estudiante> findByCorreo(String correo);


}

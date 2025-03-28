package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Curso;

@Service
public interface CursoService extends CrudService<Curso, Long>{
    /*// Buscar cursos por carrera
    List<Curso> findByCodigoCarrera_Id(Long codigoCarrera);

    // Buscar cursos por semestre
    List<Curso> findByCodigoSemestre_Id(Long codigoSemestre);

    // Buscar cursos por docente
    List<Curso> findByCodigoDocente_Id(Long codigoDocente);*/
}

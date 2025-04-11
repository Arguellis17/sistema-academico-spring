package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Curso;
import sistemaAcademico.model.Estudiante;
import sistemaAcademico.model.Horario;

import java.util.List;

@Service
public interface CursoService extends CrudService<Curso, Long>{

    List<Curso> findByCodigoSemestreId(Long codigoSemestre);

    List<Curso> findByCodigoDocenteId(Long codigoDocente);

    void inscribirEstudiante(Long codigoEstudiante, Estudiante estudiante);

    void agregarPrerrequisito(Curso prerrequisito);

    boolean validarPrerrequisitos(Long codigoEstudiante);

    void agregarCurso();

    void eliminarCurso();

    boolean validarCupos();

    Horario generarHorario();

    boolean verificarDisponibilidad();




}



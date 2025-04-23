package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Curso;
import sistemaAcademico.model.Estudiante;
import sistemaAcademico.model.Horario;
import sistemaAcademico.repository.CursoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> findById(Long id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Curso save(Curso entity) {
        return cursoRepository.save(entity);
    }

    @Override
    public Curso update(Curso entity) {
        return cursoRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        cursoRepository.deleteAll();
    }

    @Override
    public List<Curso> findByCodigoSemestreId(Long codigoSemestre) {
        return cursoRepository.findByCodigoSemestre_Id(codigoSemestre);
    }

    @Override
    public List<Curso> findByCodigoDocenteId(Long codigoDocente) {
        return cursoRepository.findByCodigoDocente_CodigoDocente(codigoDocente);
    }

    @Override
    public void inscribirEstudiante(Long codigoEstudiante, Estudiante estudiante) {
        // Ejemplo simple (necesita modelo Curso tener una lista de estudiantes)
        Optional<Curso> cursoOpt = cursoRepository.findById(codigoEstudiante);
        if (cursoOpt.isPresent()) {
            Curso curso = cursoOpt.get();
            curso.getEstudiantes().add(estudiante);
            cursoRepository.save(curso);
        }
    }

    @Override
    public void agregarPrerrequisito(Curso prerrequisito) {
        // Esto requiere contexto de a qué curso se le agrega
        // Aquí sería necesario identificar el curso actual
        // Este método es muy específico y se debe ajustar según tu modelo
    }

    @Override
    public boolean validarPrerrequisitos(Long codigoEstudiante) {
        // Lógica ficticia: podrías verificar que el estudiante tenga los cursos requeridos
        return true;
    }

    @Override
    public void agregarCurso() {
        // Esta lógica dependerá de tu sistema
        // Por ejemplo, podrías registrar un curso nuevo con datos por defecto o un formulario
    }

    @Override
    public void eliminarCurso() {
        // Este método debería recibir un ID para saber qué curso eliminar
        // Aquí falta información (como un Long idCurso)
    }

    @Override
    public boolean validarCupos() {
        // Supón que cada curso tiene un límite de cupos
        // Aquí puedes validar si aún hay cupos disponibles
        return true;
    }

    @Override
    public Horario generarHorario() {
        // Deberías construir un horario con la lógica que tengas
        return new Horario(); // Solo como placeholder
    }

    @Override
    public boolean verificarDisponibilidad() {
        // Verificar que no se crucen horarios, por ejemplo
        return true;
    }
}

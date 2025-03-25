package sistemaAcademico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Curso;
import sistemaAcademico.repository.CursoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> obtenerTodosLosCursos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> obtenerCursoPorId(Long id) {
        return cursoRepository.findById(id);
    }

    public List<Curso> obtenerCursosPorCarrera(Long codigoCarrera) {
        return cursoRepository.findByCodigoCarrera_Id(codigoCarrera);
    }

    public List<Curso> obtenerCursosPorSemestre(Long codigoSemestre) {
        return cursoRepository.findByCodigoSemestre_Id(codigoSemestre);
    }

    public List<Curso> obtenerCursosPorDocente(Long codigoDocente) {
        return cursoRepository.findByCodigoDocente_Id(codigoDocente);
    }

    public Curso guardarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void eliminarCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}

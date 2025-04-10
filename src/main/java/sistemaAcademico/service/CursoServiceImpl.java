package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Curso;
import sistemaAcademico.repository.CursoRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl implements CursoService{
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
    public List<Curso> findByCodigoCarrera_Id(Long codigoCarrera) {
        return cursoRepository.findByCodigoCarrera_Id(codigoCarrera);
    }

    @Override
    public List<Curso> findByCodigoSemestre_Id(Long codigoSemestre) {
        return cursoRepository.findByCodigoSemestre_CodigoSemestre(codigoSemestre);
    }

    @Override
    public List<Curso> findByCodigoDocente_CodigoDocente(Long codigoDocente) {
        return cursoRepository.findByCodigoDocente_CodigoDocente(codigoDocente);
    }
}

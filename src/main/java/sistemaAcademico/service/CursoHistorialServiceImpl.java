package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.CursoHistorial;
import sistemaAcademico.model.Semestre;
import sistemaAcademico.repository.CursoHistorialRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoHistorialServiceImpl implements CursoHistorialService {

        private final CursoHistorialRepository cursoHistorialRepository;

    @Override
    public List<CursoHistorial> findAll() throws Exception {
        return cursoHistorialRepository.findAll();
    }

    @Override
    public CursoHistorial save(CursoHistorial entity) throws Exception {
        return cursoHistorialRepository.save(entity);
    }

    @Override
    public CursoHistorial update(CursoHistorial entity) throws Exception {
        return cursoHistorialRepository.save(entity);
    }

    @Override
    public Semestre findById(Long id) throws Exception {
        return cursoHistorialRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        cursoHistorialRepository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        cursoHistorialRepository.deleteAll();
    }

    @Override
    public List<CursoHistorial> findByCalificacionFinal(float calificacionFinal) {
        return cursoHistorialRepository.findByCalificacionFinal(calificacionFinal);
    }
}

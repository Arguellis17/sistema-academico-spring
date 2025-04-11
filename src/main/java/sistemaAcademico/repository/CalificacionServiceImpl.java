package sistemaAcademico.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Calificacion;
import sistemaAcademico.repository.CalificacionRepository;
import sistemaAcademico.service.CalificacionService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CalificacionServiceImpl implements CalificacionService{
    private final CalificacionRepository calificacionRepository;

    @Override
    public List<Calificacion> findAll() {
        return calificacionRepository.findAll();
    }

    @Override
    public Optional<Calificacion> findById(Long id) {
        return calificacionRepository.findById(id);
    }

    @Override
    public Calificacion save(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    public Calificacion update(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    public void deleteById(Long id) {
        calificacionRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        calificacionRepository.deleteAll();
    }

    @Override
    public List<Calificacion> findByNota(float nota) {
        return calificacionRepository.findByNota(nota);
    }
}

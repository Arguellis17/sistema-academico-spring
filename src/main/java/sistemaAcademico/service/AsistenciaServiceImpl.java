package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Asistencia;
import sistemaAcademico.repository.AsistenciaRepository;
import sistemaAcademico.service.AsistenciaService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AsistenciaServiceImpl implements AsistenciaService{
    private final AsistenciaRepository asistenciaRepository;

    @Override
    public List<Asistencia> findAll() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Optional<Asistencia> findById(Long id) {
        return asistenciaRepository.findById(id);
    }

    @Override
    public Asistencia save(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public Asistencia update(Asistencia asistencia) throws Exception {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        asistenciaRepository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {

    }

    // Métodos personalizados
    @Override
    public List<Asistencia> findByFechaAsistencia(Date fechaAsistencia) {
        return asistenciaRepository.findByFechaAsistencia(fechaAsistencia);
    }

    @Override
    public List<Asistencia> findByAsistencia(boolean asistencia) {
        return asistenciaRepository.findByAsistencia(asistencia);
    }
}

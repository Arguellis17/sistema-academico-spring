package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.AsignacionDocente;
import sistemaAcademico.repository.AsignacionDocenteRepository;
import sistemaAcademico.service.AsignacionDocenteService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AsignacionDocenteServiceImpl implements AsignacionDocenteService{

    private final AsignacionDocenteRepository repository;

    @Override
    public List<AsignacionDocente> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<AsignacionDocente> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public AsignacionDocente save(AsignacionDocente entity) {
        return repository.save(entity);
    }

    @Override
    public AsignacionDocente update(AsignacionDocente entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public List<AsignacionDocente> findByFecha(Date fecha) {
        return repository.findByFecha(fecha);
    }

    @Override
    public List<AsignacionDocente> findByCargaHoraria(int cargaHoraria) {
        return repository.findByCargaHoraria(cargaHoraria);
    }
}

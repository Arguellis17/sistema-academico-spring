package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Espacio;
import sistemaAcademico.repository.EspacioRepository;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EspacioServiceImpl extends EspacioService {
    private final EspacioRepository repository;

    public List<Espacio> findAll() { return repository.findAll(); }
    public Espacio save(Espacio espacio) { return repository.save(espacio); }
    public Espacio update(Espacio espacio) { return repository.save(espacio); }
    public Optional<Espacio> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    public void deleteAll() { repository.deleteAll(); }
}

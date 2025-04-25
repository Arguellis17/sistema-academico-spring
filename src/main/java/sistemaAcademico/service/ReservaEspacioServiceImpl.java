package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.ReservaEspacio;
import sistemaAcademico.repository.ReservaEspacioRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public abstract class ReservaEspacioServiceImpl extends ReservaEspacioService {
    private final ReservaEspacioRepository repository;

    public List<ReservaEspacio> findAll() { return repository.findAll(); }
    public ReservaEspacio save(ReservaEspacio reserva) { return repository.save(reserva); }
    public ReservaEspacio update(ReservaEspacio reserva) { return repository.save(reserva); }
    public Optional<ReservaEspacio> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    public void deleteAll() { repository.deleteAll(); }
    public List<ReservaEspacio> findByEspacioId(Long codigoEspacio) {
        return repository.findByEspacioCodigoEspacio(codigoEspacio);
    }

    public boolean existeTraslape(Long espacioId, LocalDateTime inicio, LocalDateTime fin) {
        List<ReservaEspacio> reservas = findByEspacioId(espacioId);
        return reservas.stream().anyMatch(r ->
                !r.getFechaInicio().isAfter(fin) && !r.getFechaFin().isBefore(inicio)
        );
    }
}

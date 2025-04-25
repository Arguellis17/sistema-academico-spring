package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.ReservaEspacio;
import sistemaAcademico.model.Semestre;
import sistemaAcademico.repository.ReservaEspacioRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservaEspacioServiceImpl implements ReservaEspacioService {
    private final ReservaEspacioRepository reservaEspacioRepository;

    @Override
    public List<ReservaEspacio> findAll() {
        return reservaEspacioRepository.findAll();
    }

    @Override
    public ReservaEspacio save(ReservaEspacio reserva) {
        return reservaEspacioRepository.save(reserva);
    }

    @Override
    public ReservaEspacio update(ReservaEspacio reserva) {
        // Se podría agregar lógica extra si es necesario, como verificar si la reserva existe
        return reservaEspacioRepository.save(reserva);
    }

    @Override
    public Semestre findById(Long id) {
        return reservaEspacioRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        reservaEspacioRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        reservaEspacioRepository.deleteAll();
    }

    @Override
    public List<ReservaEspacio> findByEspacioId(Long codigoEspacio) {
        return reservaEspacioRepository.findByEspacioCodigoEspacio(codigoEspacio);
    }

    @Override
    public boolean existeTraslape(Long espacioId, LocalDateTime inicio, LocalDateTime fin) {
        List<ReservaEspacio> reservas = findByEspacioId(espacioId);
        return reservas.stream().anyMatch(r ->
                !r.getFechaInicio().isAfter(fin) && !r.getFechaFin().isBefore(inicio)
        );
    }

    @Override
    public List<ReservaEspacio> findByEspacioCodigoEspacio(Long codigoEspacio) {
        return reservaEspacioRepository.findByEspacioCodigoEspacio(codigoEspacio);
    }

}

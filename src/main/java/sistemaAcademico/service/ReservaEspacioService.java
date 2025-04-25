package sistemaAcademico.service;

import sistemaAcademico.model.ReservaEspacio;

import java.time.LocalDateTime;
import java.util.List;

public abstract class ReservaEspacioService implements CrudService<ReservaEspacio, Long> {
    public abstract List<ReservaEspacio> findByEspacioId(Long codigoEspacio);
    public abstract boolean existeTraslape(Long espacioId, LocalDateTime inicio, LocalDateTime fin);
}

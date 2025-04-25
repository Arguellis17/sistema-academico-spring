package sistemaAcademico.service;

import sistemaAcademico.model.ReservaEspacio;

import java.time.LocalDateTime;
import java.util.List;

public interface ReservaEspacioService extends CrudService<ReservaEspacio, Long> {

    public abstract List<ReservaEspacio> findAll();
    public abstract ReservaEspacio save(ReservaEspacio reservaEspacio);
    public abstract ReservaEspacio update(ReservaEspacio reservaEspacio);

    List<ReservaEspacio> findByEspacioId(Long codigoEspacio);

    public abstract boolean existeTraslape(Long espacioId, LocalDateTime inicio, LocalDateTime fin);
    public abstract List<ReservaEspacio> findByEspacioCodigoEspacio(Long codigoEspacio);
}

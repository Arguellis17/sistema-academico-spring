package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaAcademico.model.ReservaEspacio;
import java.util.List;

public abstract class ReservaEspacioRepository implements JpaRepository<ReservaEspacio, Long> {
    public abstract List<ReservaEspacio> findByEspacioCodigoEspacio(Long codigoEspacio);
}

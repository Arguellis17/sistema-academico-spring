package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.AsignacionDocente;

import java.util.List;
import java.util.Date;
@Repository
public interface AsignacionDocenteRepository extends JpaRepository<AsignacionDocente,Long> {

    public List<AsignacionDocente> findByFecha(Date fecha);


}

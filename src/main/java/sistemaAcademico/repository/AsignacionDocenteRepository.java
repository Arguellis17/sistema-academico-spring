package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.AsignacionDocente;
@Repository
public interface AsignacionDocenteRepository extends JpaRepository<AsignacionDocente,Long> {
}

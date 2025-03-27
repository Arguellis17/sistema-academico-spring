package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Semestre;

import java.util.Date;
import java.util.List;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Long> {

    //public List<Semestre> findByNumeroSemestre(int numeroSemestre);

    //public List<Semestre> findByFechaInicio(Date fechaInicio);

    //public List<Semestre> findByFechaFin(Date fechaFin);
}

package sistemaAcademico.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Nota;

import java.util.List;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {
    // Buscar todas las notas de un estudiante por su ID
    List<Nota> findByEstudianteId(Long idEstudiante);

    // Buscar todas las notas asociadas a una evaluación por su ID
    List<Nota> findByEvaluacionId(Long idEvaluacion);
}

}

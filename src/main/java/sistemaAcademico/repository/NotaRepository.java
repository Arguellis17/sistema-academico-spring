package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Nota;

import java.util.List;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {

    // Método para buscar notas por ID del estudiante
    List<Nota> findByEstudianteId(Long idEstudiante);

    // Método para buscar notas por ID de la evaluación
    List<Nota> findByEvaluacionId(Long idEvaluacion);
}

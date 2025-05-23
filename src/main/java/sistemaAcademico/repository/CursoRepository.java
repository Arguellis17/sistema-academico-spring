package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Curso;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    // Buscar cursos por carrera
    List<Curso> findByCodigoCarrera_Id(Long codigoCarrera);

    // Buscar cursos por semestre
    List<Curso> findByCodigoSemestre_Id(Long codigoSemestre);

    // Buscar cursos por docente
    List<Curso> findByCodigoDocente_CodigoDocente(Long codigoDocente);
}

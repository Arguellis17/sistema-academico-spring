package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.CursoHistorial;

import java.util.List;

@Repository
public interface CursoHistorialRepository extends JpaRepository<CursoHistorial, Long> {

    public List<CursoHistorial> findByCalificacionFinal(float calificacionFinal);
    List<CursoHistorial> findByHistorialAcademico_Estudiante_CodigoEstudiante(Long codigoEstudiante);
}

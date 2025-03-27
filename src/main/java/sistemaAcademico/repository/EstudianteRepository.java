package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Estudiante;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    // Buscar estudiantes por código de carrera
    //List<Estudiante> findByCodigoCarreraCodigoCarrera(Long codigoCarrera);

    // Buscar estudiantes por semestre
    //List<Estudiante> findBySemestre(int semestre);

}

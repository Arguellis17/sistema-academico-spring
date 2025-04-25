package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Facultad;

import java.util.List;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long> {

    public List<Facultad> findByNombre(String nombre);
}

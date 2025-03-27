package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Foro;

import java.util.Date;
import java.util.List;

@Repository
public interface ForoRepository extends JpaRepository<Foro, Long> {

    //public List<Foro> findByTitulo(String titulo);

    //public List<Foro> findByDescripcion(String descripcion);

    //public List<Foro> findByfechaCreacion(Date fechaCreacion);

}

package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Docente;

import java.util.List;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {

    public List<Docente> findByTitulo(String titulo);

    public List<Docente> findByEspecializacion(String especializacion);

    public List<Docente> findByCargaHoraria(int cargaHoraria);
}

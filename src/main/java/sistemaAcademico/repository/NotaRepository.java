package sistemaAcademico.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {

}

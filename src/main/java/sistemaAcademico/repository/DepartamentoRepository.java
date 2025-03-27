package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Departamento;

import java.util.List;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    public List<Departamento> findByCodigoDepartamento(String codigoDepartamento);

    public List<Departamento> findByNombre(String nombre);
}

package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Departamento;

@Service
public interface DepartamentoService extends CrudService<Departamento, Long>{
    /*public List<Departamento> findByCodigoDepartamento(String codigoDepartamento);

    public List<Departamento> findByNombre(String nombre);*/
}

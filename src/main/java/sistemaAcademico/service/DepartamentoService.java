package sistemaAcademico.service;

import sistemaAcademico.model.Departamento;

import java.util.List;

public interface DepartamentoService extends CrudService<Departamento, Long>{
    public List<Departamento> findByCodigoDepartamento(String codigoDepartamento);

    public List<Departamento> findByNombre(String nombre);
}

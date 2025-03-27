package sistemaAcademico.service;

import sistemaAcademico.model.Matricula;

import java.util.Date;
import java.util.List;

public interface MatriculaService extends CrudService<Matricula, Long>{
    public List<Matricula> findByFechaMatricula(Date fechaMatricula);
}

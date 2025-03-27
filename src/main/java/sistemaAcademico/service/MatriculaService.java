package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Matricula;

import java.util.Date;
import java.util.List;

@Service
public interface MatriculaService extends CrudService<Matricula, Long>{
    public List<Matricula> findByFechaMatricula(Date fechaMatricula);
}

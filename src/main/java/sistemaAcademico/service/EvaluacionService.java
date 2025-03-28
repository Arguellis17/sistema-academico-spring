package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Evaluacion;

@Service
public interface EvaluacionService extends CrudService<Evaluacion, Long> {

    //public List<Evaluacion> findByTipo(String tipo);

    //public List<Evaluacion> findByPonderacion(float ponderacion);

    //public List<Evaluacion> findByFechaEvaluacion(Date fechaEvaluacion);


}

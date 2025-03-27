package sistemaAcademico.service;

import sistemaAcademico.model.Semestre;

import java.util.Date;
import java.util.List;

public interface SemestreService extends CrudService<Semestre, Long>{
    public List<Semestre> findByNumeroSemestre(int numeroSemestre);

    public List<Semestre> findByFechaInicio(Date fechaInicio);

    public List<Semestre> findByFechaFin(Date fechaFin);
}

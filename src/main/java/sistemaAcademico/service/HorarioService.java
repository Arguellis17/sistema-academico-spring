package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Horario;

@Service
public interface HorarioService extends CrudService<Horario, Long> {

    //public List<Horario> findByCodigoCurso(Curso codigoCurso);

    //public List<Horario> findByHoraInicio(Date horaInicio);

    //public List<Horario> findByHoraFin(Date horaFin);

    //public List<Horario> findByTipoSesion(String tipoSesion);

}

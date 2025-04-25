package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Horario;
import java.util.Date;
import java.util.List;
import sistemaAcademico.model.Curso;

@Service
public interface HorarioService extends CrudService<Horario, Long> {

    public List<Horario> findByCodigoCurso(Curso codigoCurso);

    public List<Horario> findByHoraInicio(Date horaInicio);

    public List<Horario> findByHoraFin(Date horaFin);

    public List<Horario> findByTipoSesion(String tipoSesion);

    Horario modificarHorario(Long id, Date nuevaHoraInicio, Date nuevaHoraFin) throws Exception;

    Horario asignarHorario(Curso curso, Date horaInicio, Date horaFin, String tipoSesion);

    boolean verificarDisponibilidad(Curso curso, Date horaInicio, Date horaFin);

    public List<String> optimizarUsoRecursos();

}

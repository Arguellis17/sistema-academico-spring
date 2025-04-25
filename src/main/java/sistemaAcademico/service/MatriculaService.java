package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Matricula;

@Service
public interface MatriculaService extends CrudService<Matricula, Long>{
    Matricula registrarMatricula(String estudianteId, String cursoId);
    void cancelarMatricula(String matriculaId);
    int consultarCuposDisponibles(String cursoId);
    boolean validarPrerrequisitos(String estudianteId, String cursoId);
}

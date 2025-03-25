package sistemaAcademico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Estudiante;
import sistemaAcademico.repository.EstudianteRepository;
import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerPorCarrera(Long codigoCarrera) {
        return estudianteRepository.findByCodigoCarrera_Id(codigoCarrera);
    }

    public List<Estudiante> obtenerPorSemestre(int semestre) {
        return estudianteRepository.findBySemestre(semestre);
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}

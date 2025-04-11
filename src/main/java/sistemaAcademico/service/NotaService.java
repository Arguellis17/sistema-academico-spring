package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Nota;
import sistemaAcademico.repository.NotaRepository;

import java.util.List;
import java.util.Optional;

@Service
// La anotacion @RequiredArgsConstructor se utiliza para generar un constructor con argumentos requeridos
// automaticamente, lo que significa que se generara un constructor que acepta todos los campos finales
@RequiredArgsConstructor
public class NotaService {

    @Autowired
    private final NotaRepository notaRepository;

    // Guardar o actualizar una nota
    public Nota guardarNota(Nota nota) {
        return notaRepository.save(nota);
    }

    // Obtener todas las notas
    public List<Nota> obtenerTodasLasNotas() {
        return notaRepository.findAll();
    }

    // Buscar una nota por su ID
    public Optional<Nota> obtenerNotaPorId(Long id) {
        return notaRepository.findById(id);
    }

    // Eliminar una nota por su ID
    public void eliminarNota(Long id) {
        notaRepository.deleteById(id);
    }

    // Buscar notas por el ID del estudiante
    public List<Nota> obtenerNotasPorEstudiante(Long idEstudiante) {
        return notaRepository.findByEstudianteId(idEstudiante);
    }

    // Buscar notas por el ID de la evaluación
    public List<Nota> obtenerNotasPorEvaluacion(Long idEvaluacion) {
        return notaRepository.findByEvaluacionId(idEvaluacion);
    }
}


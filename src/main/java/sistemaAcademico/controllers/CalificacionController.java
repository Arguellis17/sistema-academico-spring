package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Calificacion;
import sistemaAcademico.service.CalificacionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/calificaciones")
@RequiredArgsConstructor
public class CalificacionController {
    private final CalificacionService calificacionService;

    // Obtener todas las calificaciones
    @GetMapping
    public List<Calificacion> getAll() throws Exception {
        return calificacionService.findAll();
    }

    // Obtener calificación por ID
    @GetMapping("/{id}")
    public ResponseEntity<Calificacion> getById(@PathVariable Long id) throws Exception {
        Optional<Calificacion> calificacion = calificacionService.findById(id);
        return calificacion.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Guardar una nueva calificación
    @PostMapping
    public Calificacion save(@RequestBody Calificacion calificacion) throws Exception {
        return calificacionService.save(calificacion);
    }

    // Actualizar una calificación
    @PutMapping("/{id}")
    public ResponseEntity<Calificacion> update(@PathVariable Long id, @RequestBody Calificacion nuevaCalificacion) throws Exception {
        Optional<Calificacion> existente = calificacionService.findById(id);
        if (existente.isPresent()) {
            nuevaCalificacion.setCodigoCalificacion(id);
            return ResponseEntity.ok(calificacionService.update(nuevaCalificacion));
        }
        return ResponseEntity.notFound().build();
    }

    // Eliminar calificación por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        if (calificacionService.findById(id).isPresent()) {
            calificacionService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Buscar por nota
    @GetMapping("/nota/{nota}")
    public List<Calificacion> findByNota(@PathVariable float nota) {
        return calificacionService.findByNota(nota);
    }
}

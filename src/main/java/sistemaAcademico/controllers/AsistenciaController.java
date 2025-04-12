package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Asistencia;
import sistemaAcademico.service.AsistenciaService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/asistencias")
@RequiredArgsConstructor
public class AsistenciaController {
    private final AsistenciaService asistenciaService;

    @GetMapping
    public List<Asistencia> getAll() throws Exception {
        return asistenciaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> getById(@PathVariable Long id) throws Exception {
        return asistenciaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Asistencia save(@RequestBody Asistencia asistencia) throws Exception {
        return asistenciaService.save(asistencia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        asistenciaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/fecha")
    public List<Asistencia> getByFecha(@RequestParam("fecha") Date fecha) {
        return asistenciaService.findByFechaAsistencia(fecha);
    }

    @GetMapping("/estado")
    public List<Asistencia> getByEstado(@RequestParam("asistencia") boolean asistencia) {
        return asistenciaService.findByAsistencia( asistencia);
    }


}

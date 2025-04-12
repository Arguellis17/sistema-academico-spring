package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.AsignacionDocente;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asignaciones")
@RequiredArgsConstructor
public class AsignacionDocenteController {

    @Qualifier("asignacionDocenteService")
    private final AsignacionDocenteService service;

    @GetMapping
    public ResponseEntity<List<AsignacionDocente>> findAll() throws Exception {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsignacionDocente> findById(@PathVariable Long id) throws Exception {
        Optional<AsignacionDocente> result = service.findById(id);
        return result.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AsignacionDocente> save(@RequestBody AsignacionDocente asignacionDocente) throws Exception {
        return ResponseEntity.ok(service.save(asignacionDocente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AsignacionDocente> update(@PathVariable Long id,
                                                    @RequestBody AsignacionDocente asignacionDocente) throws Exception {
        asignacionDocente.setCodigoAsignacionDocente(id);
        return ResponseEntity.ok(service.update(asignacionDocente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/fecha")
    public ResponseEntity<List<AsignacionDocente>> findByFecha(@RequestParam Date fecha) {
        return ResponseEntity.ok(service.findByFecha(fecha));
    }

    @GetMapping("/carga-horaria/{cargaHoraria}")
    public ResponseEntity<List<AsignacionDocente>> findByCargaHoraria(@PathVariable int cargaHoraria) {
        return ResponseEntity.ok(service.findByCargaHoraria(cargaHoraria));
    }
}

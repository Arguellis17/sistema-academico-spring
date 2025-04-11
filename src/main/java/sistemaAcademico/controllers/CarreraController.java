package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Carrera;
import sistemaAcademico.service.CarreraService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carreras")
@RequiredArgsConstructor
public class CarreraController {
    private final CarreraService carreraService;

    // Obtener todas las carreras
    @GetMapping
    public List<Carrera> getAll() throws Exception {
        return carreraService.findAll();
    }

    // Obtener carrera por ID
    @GetMapping("/{id}")
    public ResponseEntity<Carrera> getById(@PathVariable Long id) throws Exception {
        Optional<Carrera> carrera = carreraService.findById(id);
        return carrera.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Guardar nueva carrera
    @PostMapping
    public Carrera save(@RequestBody Carrera carrera) throws Exception {
        return carreraService.save(carrera);
    }

    // Actualizar carrera existente
    @PutMapping("/{id}")
    public ResponseEntity<Carrera> update(@PathVariable Long id, @RequestBody Carrera carreraActualizada) throws Exception {
        Optional<Carrera> existente = carreraService.findById(id);
        if (existente.isPresent()) {
            carreraActualizada.setCodigoCarrera(id);
            return ResponseEntity.ok(carreraService.update(carreraActualizada));
        }
        return ResponseEntity.notFound().build();
    }

    // Eliminar carrera
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        if (carreraService.findById(id).isPresent()) {
            carreraService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Buscar carreras por nombre (si implementas en el servicio y repositorio)
    /*
    @GetMapping("/nombre/{nombre}")
    public List<Carrera> getByNombre(@PathVariable String nombre) {
        return carreraService.findByNombreCarrera(nombre);
    }

    // Buscar por duración
    @GetMapping("/duracion/{duracion}")
    public List<Carrera> getByDuracion(@PathVariable int duracion) {
        return carreraService.findByDuracion(duracion);
    }
    */
}

package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Rol;
import sistemaAcademico.service.RolService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RolController {

    private final RolService rolService;

    /**
     * Obtiene la lista de todos los roles
     */
    @GetMapping
    public List<Rol> getAllRoles() throws Exception {
        return rolService.findAll();
    }

    /**
     * Obtiene un rol por su ID
     */
    @GetMapping("/{codigoRol}")
    public Optional<Rol> getRolById(@PathVariable Long codigoRol) throws Exception {
        return rolService.findById(codigoRol);
    }

    /**
     * Crea un nuevo rol
     */
    @PostMapping
    public Rol createRol(@RequestBody Rol rol) throws Exception {
        return rolService.save(rol);
    }

    /**
     * Actualiza un rol existente
     */
    @PutMapping("/{codigoRol}")
    public Rol updateRol(@PathVariable Long codigoRol, @RequestBody Rol rol) throws Exception {
        rol.setCodigoRol(codigoRol);
        return rolService.update(rol);
    }

    /**
     * Elimina un rol por ID
     */
    @DeleteMapping("/{codigoRol}")
    public void deleteRol(@PathVariable Long codigoRol) throws Exception {
        rolService.deleteById(codigoRol);
    }

    /**
     * Elimina todos los roles
     */
    @DeleteMapping
    public void deleteAllRoles() throws Exception {
        rolService.deleteAll();
    }

    /*
    @GetMapping("/buscar/nombre")
    public List<Rol> getRolesByNombre(@RequestParam String nombre) throws Exception {
        return rolService.findByNombre(nombre);
    }

    @GetMapping("/buscar/tipoRol")
    public List<Rol> getRolesByTipoRol(@RequestParam String tipoRol) throws Exception {
        return rolService.findByTipoRol(tipoRol);
    }
    */
}

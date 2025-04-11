package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Usuario;
import sistemaAcademico.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    /**
     * Obtiene la lista de todos los usuarios
     */
    @GetMapping
    public List<Usuario> getAllUsuarios() throws Exception {
        return usuarioService.findAll();
    }

    /**
     * Obtiene un usuario por su ID
     */
    @GetMapping("/{codigoUsuario}")
    public Optional<Usuario> getUsuarioById(@PathVariable Long codigoUsuario) throws Exception {
        return usuarioService.findById(codigoUsuario);
    }

    /**
     * Crea un nuevo usuario
     */
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) throws Exception {
        return usuarioService.save(usuario);
    }

    /**
     * Actualiza un usuario existente
     */
    @PutMapping("/{codigoUsuario}")
    public Usuario updateUsuario(@PathVariable Long codigoUsuario, @RequestBody Usuario usuario) throws Exception {
        usuario.setCodigoUsuario(codigoUsuario);
        return usuarioService.update(usuario);
    }

    /**
     * Elimina un usuario por ID
     */
    @DeleteMapping("/{codigoUsuario}")
    public void deleteUsuario(@PathVariable Long codigoUsuario) throws Exception {
        usuarioService.deleteById(codigoUsuario);
    }

    /**
     * Elimina todos los usuarios
     */
    @DeleteMapping
    public void deleteAllUsuarios() throws Exception {
        usuarioService.deleteAll();
    }

    /*
    @GetMapping("/buscar/personaDocumento")
    public List<Usuario> getUsuariosByPersonaDocumento(@RequestParam String personaDocumento) throws Exception {
        return usuarioService.findByPersonaDocumento(personaDocumento);
    }

    @GetMapping("/buscar/nombre")
    public List<Usuario> getUsuariosByNombre(@RequestParam String nombre) throws Exception {
        return usuarioService.findByNombre(nombre);
    }

    @GetMapping("/buscar/sesionActiva")
    public List<Usuario> getUsuariosBySesionActiva(@RequestParam boolean sesionActiva) throws Exception {
        return usuarioService.findBySesionActiva(sesionActiva);
    }
    */
}

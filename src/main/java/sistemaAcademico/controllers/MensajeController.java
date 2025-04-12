package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Mensaje;
import sistemaAcademico.service.MensajeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mensajes")
@RequiredArgsConstructor
public class MensajeController {

    private final MensajeService mensajeService;

    /**
     * Obtiene la lista de todos los mensajes
     */
    @GetMapping
    public List<Mensaje> getAllMensajes() throws Exception {
        return mensajeService.findAll();
    }

    /**
     * Obtiene un mensaje por su ID
     */
    @GetMapping("/{codigoMensaje}")
    public Optional<Mensaje> getMensajeById(@PathVariable Long codigoMensaje) throws Exception {
        return mensajeService.findById(codigoMensaje);
    }

    /**
     * Crea un nuevo mensaje
     */
    @PostMapping
    public Mensaje createMensaje(@RequestBody Mensaje mensaje) throws Exception {
        return mensajeService.save(mensaje);
    }

    /**
     * Actualiza un mensaje existente
     */
    @PutMapping("/{codigoMensaje}")
    public Mensaje updateMensaje(@PathVariable Long codigoMensaje, @RequestBody Mensaje mensaje) throws Exception {
        mensaje.setCodigoMensaje(codigoMensaje);
        return mensajeService.update(mensaje);
    }

    /**
     * Elimina un mensaje por ID
     */
    @DeleteMapping("/{codigoMensaje}")
    public void deleteMensaje(@PathVariable Long codigoMensaje) throws Exception {
        mensajeService.deleteById(codigoMensaje);
    }

    /**
     * Elimina todos los mensajes
     */
    @DeleteMapping
    public void deleteAllMensajes() throws Exception {
        mensajeService.deleteAll();
    }

    /*
    @GetMapping("/buscar/contenido")
    public List<Mensaje> getMensajesByContenido(@RequestParam String contenido) throws Exception {
        return mensajeService.findByContenido(contenido);
    }

    @GetMapping("/buscar/fecha")
    public List<Mensaje> getMensajesByFechaEnvio(@RequestParam Date fechaEnvio) throws Exception {
        return mensajeService.findByFechaEnvio(fechaEnvio);
    }
    */

    @GetMapping("/buscar/contenido")
    public List<Mensaje> buscarPorContenido(@RequestParam String contenido) throws Exception {
        return mensajeService.findByContenido(contenido);
    }

    @GetMapping("/buscar/chat")
    public List<Mensaje> buscarPorChat(@RequestParam Long idChat) throws Exception {
        return mensajeService.findByChatId(idChat);
    }

}

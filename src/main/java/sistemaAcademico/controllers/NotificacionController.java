package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Notificacion;
import sistemaAcademico.service.NotificacionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notificaciones")
@RequiredArgsConstructor
public class NotificacionController {

    private final NotificacionService notificacionService;

    /**
     * Obtiene la lista de todas las notificaciones
     */
    @GetMapping
    public List<Notificacion> getAllNotificaciones() throws Exception {
        return notificacionService.findAll();
    }

    /**
     * Obtiene una notificación por su ID
     */
    @GetMapping("/{codigoNotificacion}")
    public Optional<Notificacion> getNotificacionById(@PathVariable Long codigoNotificacion) throws Exception {
        return notificacionService.findById(codigoNotificacion);
    }

    /**
     * Crea una nueva notificación
     */
    @PostMapping
    public Notificacion createNotificacion(@RequestBody Notificacion notificacion) throws Exception {
        return notificacionService.save(notificacion);
    }

    /**
     * Actualiza una notificación existente
     */
    @PutMapping("/{codigoNotificacion}")
    public Notificacion updateNotificacion(@PathVariable Long codigoNotificacion, @RequestBody Notificacion notificacion) throws Exception {
        notificacion.setCodigoNotificacion(codigoNotificacion);
        return notificacionService.update(notificacion);
    }

    /**
     * Elimina una notificación por ID
     */
    @DeleteMapping("/{codigoNotificacion}")
    public void deleteNotificacion(@PathVariable Long codigoNotificacion) throws Exception {
        notificacionService.deleteById(codigoNotificacion);
    }

    /**
     * Elimina todas las notificaciones
     */
    @DeleteMapping
    public void deleteAllNotificaciones() throws Exception {
        notificacionService.deleteAll();
    }

    /*
    @GetMapping("/buscar/mensaje")
    public List<Notificacion> getNotificacionesByMensaje(@RequestParam String mensaje) throws Exception {
        return notificacionService.findByMensaje(mensaje);
    }

    @GetMapping("/buscar/fecha")
    public List<Notificacion> getNotificacionesByFechaEnvio(@RequestParam Date fechaEnvio) throws Exception {
        return notificacionService.findByFechaEnvio(fechaEnvio);
    }

    @GetMapping("/buscar/tipo")
    public List<Notificacion> getNotificacionesByTipo(@RequestParam String tipo) throws Exception {
        return notificacionService.findByTipo(tipo);
    }

    @GetMapping("/buscar/estado")
    public List<Notificacion> getNotificacionesByEstado(@RequestParam String estado) throws Exception {
        return notificacionService.findByEstado(estado);
    }
    */
}

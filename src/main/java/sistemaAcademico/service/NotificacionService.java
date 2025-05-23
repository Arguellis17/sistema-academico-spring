package sistemaAcademico.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Notificacion;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface NotificacionService extends CrudService<Notificacion, Long> {
    void enviarNotificacion();

    void marcarComoLeida();

    @Scheduled(fixedRate = 86400000) // Cada 24 horas
    void programarNotificacionAutomatica();

    List<Notificacion> findByMensaje(String mensaje);

    List<Notificacion> findByFechaEnvio(LocalDateTime desde, LocalDateTime hasta);

    List<Notificacion> findByTipo(String tipo);

    List<Notificacion> findByLeido(boolean leido);

    List<Notificacion> findByUsuarioDestino(Long codigoUsuarioDestino);
}

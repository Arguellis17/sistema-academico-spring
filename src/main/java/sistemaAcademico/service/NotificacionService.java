package sistemaAcademico.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Notificacion;

@Service
public interface NotificacionService extends CrudService<Notificacion, Long> {
    void enviarNotificacion();

    void marcarComoLeida();

    @Scheduled(fixedRate = 86400000) // Cada 24 horas
    void programarNotificacionAutomatica();

    //public List<Notificacion> findByMensaje(String mensaje);

    //public List<Notificacion> findByFechaEnvio(Date fechaEnvio);

    //public List<Notificacion> findByTipo(String tipo);

    //public List<Notificacion> findByEstado(String estado);
}

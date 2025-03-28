package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Notificacion;

@Service
public interface NotificacionService extends CrudService<Notificacion, Long> {

    //public List<Notificacion> findByMensaje(String mensaje);

    //public List<Notificacion> findByFechaEnvio(Date fechaEnvio);

    //public List<Notificacion> findByTipo(String tipo);

    //public List<Notificacion> findByEstado(String estado);
}

package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Notificacion;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {

    List<Notificacion> findByMensajeContainingIgnoreCase(String mensaje);

    List<Notificacion> findByFechaEnvioBetween(LocalDateTime desde, LocalDateTime hasta);

    List<Notificacion> findByTipo(String tipo);

    List<Notificacion> findByLeido(boolean leido);

    List<Notificacion> findByCodigoUsuarioDestino(Long codigoUsuarioDestino);
}

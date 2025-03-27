package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Notificacion;

import java.util.Date;
import java.util.List;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {

    //public List<Notificacion> findByMensaje(String mensaje);

    //public List<Notificacion> findByFechaEnvio(Date fechaEnvio);

    //public List<Notificacion> findByTipo(String tipo);

    //public List<Notificacion> findByEstado(String estado);
}

package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Mensaje;

import java.util.Date;
import java.util.List;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long> {

    //public List<Mensaje> findByContenido(String contenido);

    //public List<Mensaje> findByFechaEnvio(Date fechaEnvio);

}

package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Mensaje;

@Service
public interface MensajeService extends CrudService<Mensaje, Long> {

    //public List<Mensaje> findByContenido(String contenido);

    //public List<Mensaje> findByFechaEnvio(Date fechaEnvio);

}

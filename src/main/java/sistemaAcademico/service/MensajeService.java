package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Mensaje;

import java.util.Date;
import java.util.List;

@Service
public interface MensajeService extends CrudService<Mensaje, Long> {

    //public List<Mensaje> findByContenido(String contenido);

    //public List<Mensaje> findByFechaEnvio(Date fechaEnvio);

    void enviarMensaje(Mensaje mensaje) throws Exception;

    List<Mensaje> recibirMensajes(Long idReceptor) throws Exception;

    List<Mensaje> findByContenido(String contenido) throws Exception;

    List<Mensaje> findByFechaEnvio(Date fechaEnvio) throws Exception;

    List<Mensaje> findByChatId(Long chatId) throws Exception;

    List<Mensaje> findByEmisorId(Long emisorId) throws Exception;

}

package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Chat;
import java.util.List;
import java.util.Date;

@Service
public interface ChatService extends CrudService<Chat, Long> {

    public List<Chat> findByFechaCreacion(Date fechaCreacion);
}

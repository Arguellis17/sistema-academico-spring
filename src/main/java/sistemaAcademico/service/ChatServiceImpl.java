package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;
import sistemaAcademico.model.Chat;
import sistemaAcademico.repository.ChatRepository;

import java.util.List;
import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;

    @Override
    public List<Chat> findAll() throws Exception {
        return chatRepository.findAll();
    }

    @Override
    public Chat save(Chat chat) throws Exception {
        return chatRepository.save(chat);
    }

    @Override
    public Chat update(Chat chat) throws Exception {
        return chatRepository.save(chat); // Si usas lógica de validación, puede ir aquí
    }

    @Override
    public Optional<Chat> findById(Long id) throws Exception {
        return chatRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        chatRepository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        chatRepository.deleteAll();
    }

    @Override
    public List<Chat> findByFechaCreacion(Date fechaCreacion) {
        return chatRepository.findByFechaCreacion(fechaCreacion);
    }

}

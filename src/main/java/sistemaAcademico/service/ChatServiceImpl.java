package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Chat;
import sistemaAcademico.model.Usuario;
import sistemaAcademico.repository.ChatRepository;
import sistemaAcademico.service.ChatService;

import java.util.Date;
import java.util.List;
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
    public Optional<Chat> findById(Long id) throws Exception {
        return chatRepository.findById(id);
    }

    @Override
    public Chat save(Chat entity) throws Exception {
        return chatRepository.save(entity);
    }

    @Override
    public Chat update(Chat entity) throws Exception {
        return chatRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        chatRepository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        chatRepository.deleteAll();
    }

    // ================= MÉTODOS PERSONALIZADOS =================

    @Override
    public void iniciarChat(Chat chat) throws Exception {
        chat.setFechaCreacion(new Date()); // Fecha actual
        chatRepository.save(chat);
    }

    @Override
    public void cerrarChat(Long id) throws Exception {
        Optional<Chat> chat = chatRepository.findById(id);
        if (chat.isPresent()) {
            chatRepository.deleteById(id); // Podrías añadir un campo "activo" si no quieres eliminarlo
        } else {
            throw new Exception("Chat no encontrado");
        }
    }

    @Override
    public List<Chat> findByFechaCreacion(Date fechaCreacion) throws Exception {
        return chatRepository.findByFechaCreacion(fechaCreacion);
    }

    @Override
    public List<Chat> findChatsByUsuarioId(Long usuarioId) throws Exception {
        return chatRepository.findByCodigoUsuario1IdOrCodigoUsuario2Id(usuarioId, usuarioId);
    }

    public Optional<Chat> obtenerChatEntreUsuarios(Usuario u1, Usuario u2) {
        // Buscar en ambas combinaciones (u1-u2 y u2-u1)
        Optional<Chat> chat = chatRepository.findByCodigoUsuario1AndCodigoUsuario2(u1, u2);

        if (chat.isEmpty()) {
            chat = chatRepository.findByCodigoUsuario2AndCodigoUsuario1(u1, u2);
        }

        return chat;
    }

}

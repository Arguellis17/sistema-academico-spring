package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.*;
import sistemaAcademico.repository.ChatRepository;
import sistemaAcademico.repository.MensajeRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MensajeServiceImpl implements MensajeService{



    private final MensajeRepository mensajeRepository;
    private final ChatRepository chatRepository;
    private final ChatService chatService;
    @Override
    public List<Mensaje> findAll() throws Exception {
        return mensajeRepository.findAll();
    }

    @Override
    public Semestre findById(Long id) throws Exception {
        return mensajeRepository.findById(id);
    }

    @Override
    public Mensaje save(Mensaje entity) throws Exception {
        return mensajeRepository.save(entity);
    }

    @Override
    public Mensaje update(Mensaje entity) throws Exception {
        return mensajeRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        mensajeRepository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        mensajeRepository.deleteAll();
    }

    // =================== MÉTODOS PERSONALIZADOS ===================

    @Override
    public void enviarMensaje(Mensaje mensaje) throws Exception {
        mensaje.setFechaEnvio(new Date()); // Asignar fecha actual
        mensaje.setLeido(false);           // Inicia como no leído

        Usuario emisor = mensaje.getEmisor();
        Usuario receptor = mensaje.getReceptor();

        // Verifica si ya existe un chat entre los usuarios
        Optional<Chat> chatExistente = chatService.obtenerChatEntreUsuarios(emisor, receptor);

        if (chatExistente.isPresent()) {
            mensaje.setChat(chatExistente.get());
        } else {
            Chat nuevoChat = new Chat();
            nuevoChat.setCodigoUsuario1(emisor);
            nuevoChat.setCodigoUsuario2(receptor);
            nuevoChat.setFechaCreacion(new Date());
            chatRepository.save(nuevoChat);
            mensaje.setChat(nuevoChat);
        }

        // Finalmente guarda el mensaje
        mensajeRepository.save(mensaje);
    }

    @Override
    public List<Mensaje> recibirMensajes(Long idReceptor) throws Exception {
        List<Mensaje> mensajes = mensajeRepository.findByReceptorId(idReceptor);
        for (Mensaje m : mensajes) {
            if (!m.isLeido()) {
                m.setLeido(true); // Marcar como leído al recibir
                mensajeRepository.save(m);
            }
        }
        return mensajes;
    }

    @Override
    public List<Mensaje> findByContenido(String contenido) throws Exception {
        return mensajeRepository.findByContenidoContainingIgnoreCase(contenido);
    }

    @Override
    public List<Mensaje> findByFechaEnvio(Date fechaEnvio) throws Exception {
        return mensajeRepository.findByFechaEnvio(fechaEnvio);
    }

    @Override
    public List<Mensaje> findByChatId(Long chatId) throws Exception {
        return mensajeRepository.findByChatCodigoChat(chatId);
    }

    @Override
    public List<Mensaje> findByEmisorId(Long emisorId) throws Exception {
        return mensajeRepository.findByEmisorId(emisorId);
    }


}

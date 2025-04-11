package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Chat;
import sistemaAcademico.service.ChatService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chats")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    /**
     * Obtiene la lista de todos los chats
     */
    @GetMapping
    public List<Chat> getAllChats() throws Exception {
        return chatService.findAll();
    }

    /**
     * Obtiene un chat por su ID
     */
    @GetMapping("/{codigoChat}")
    public Optional<Chat> getChatById(@PathVariable Long codigoChat) throws Exception {
        return chatService.findById(codigoChat);
    }

    /**
     * Crea un nuevo chat
     */
    @PostMapping
    public Chat createChat(@RequestBody Chat chat) throws Exception {
        return chatService.save(chat);
    }

    /**
     * Actualiza un chat existente
     */
    @PutMapping("/{codigoChat}")
    public Chat updateChat(@PathVariable Long codigoChat, @RequestBody Chat chat) throws Exception {
        chat.setCodigoChat(codigoChat);
        return chatService.update(chat);
    }

    /**
     * Elimina un chat por ID
     */
    @DeleteMapping("/{codigoChat}")
    public void deleteChat(@PathVariable Long codigoChat) throws Exception {
        chatService.deleteById(codigoChat);
    }

    /**
     * Elimina todos los chats
     */
    @DeleteMapping
    public void deleteAllChats() throws Exception {
        chatService.deleteAll();
    }

    /*
     * Búsqueda por fecha de creación (si decides implementar esta funcionalidad)
     */
    /*
    @GetMapping("/buscar/fecha-creacion")
    public List<Chat> getChatsByFechaCreacion(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaCreacion) throws Exception {
        return chatService.findByFechaCreacion(fechaCreacion);
    }
    */
}

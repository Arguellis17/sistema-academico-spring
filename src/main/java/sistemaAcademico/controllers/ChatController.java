package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Chat>> getAllChats() throws Exception {
        List<Chat> chats = chatService.findAll();
        return ResponseEntity.ok(chats);
    }

    /**
     * Obtiene un chat por su ID
     */
    @GetMapping("/{codigoChat}")
    public ResponseEntity<Chat> getChatById(@PathVariable Long codigoChat) throws Exception {
        Optional<Chat> chat = chatService.findById(codigoChat);
        return chat.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build()); // 404 si no se encuentra
    }

    /**
     * Crea un nuevo chat
     */
    @PostMapping
    public ResponseEntity<Chat> createChat(@RequestBody Chat chat) throws Exception {
        Chat createdChat = chatService.save(chat);
        return ResponseEntity.status(201).body(createdChat); // 201 para creación exitosa
    }

    /**
     * Actualiza un chat existente
     */
    @PutMapping("/{codigoChat}")
    public ResponseEntity<Chat> updateChat(@PathVariable Long codigoChat, @RequestBody Chat chat) throws Exception {
        chat.setCodigoChat(codigoChat);
        return ResponseEntity.ok(chatService.update(chat)); // 200 si es exitoso
    }

    /**
     * Elimina un chat por ID
     */
    @DeleteMapping("/{codigoChat}")
    public ResponseEntity<Void> deleteChat(@PathVariable Long codigoChat) throws Exception {
        if (chatService.findById(codigoChat).isPresent()) {
            chatService.deleteById(codigoChat);
            return ResponseEntity.noContent().build(); // 204 si se elimina exitosamente
        }
        return ResponseEntity.notFound().build(); // 404 si no se encuentra
    }

    /**
     * Elimina todos los chats
     */
    @DeleteMapping
    public ResponseEntity<Void> deleteAllChats() throws Exception {
        chatService.deleteAll();
        return ResponseEntity.noContent().build(); // 204 si se eliminan todos
    }
    
    @GetMapping("/buscar/fecha-creacion")
    public List<Chat> getChatsByFechaCreacion(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaCreacion) throws Exception {
        return chatService.findByFechaCreacion(fechaCreacion);
    }
}

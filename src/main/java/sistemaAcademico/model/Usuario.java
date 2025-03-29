package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoUsuario;

    private String personaDocumento;
    private String nombre;
    private String clave;

    @ManyToOne
    @JoinColumn(name = "codigo_rol")
    private Rol rol;

    private boolean sesionActiva;

    // Relación con los chats donde el usuario es "codigoUsuario1"
    @OneToMany(mappedBy = "codigoUsuario1")
    private List<Chat> chatsComoUsuario1;

    // Relación con los chats donde el usuario es "codigoUsuario2"
    @OneToMany(mappedBy = "codigoUsuario2")
    private List<Chat> chatsComoUsuario2;

    // Relación con los mensajes enviados
    @OneToMany(mappedBy = "emisor")
    private List<Mensaje> mensajesEnviados;

    // Relación con los mensajes recibidos
    @OneToMany(mappedBy = "receptor")
    private List<Mensaje> mensajesRecibidos;

    // Agregando la relacion con la clase Foro
    @ManyToMany (mappedBy = "codigoUsuario")
    private List<Foro> foros;

    @OneToMany(mappedBy = "usuario")
    private List<Notificacion> notificacionesEnviadas;

    @OneToMany(mappedBy = "destinatario")
    private List<Notificacion> notificacionesRecibidas;
}

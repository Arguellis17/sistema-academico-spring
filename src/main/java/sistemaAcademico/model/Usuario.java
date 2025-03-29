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

    // Agregando relacion con la clase Chat
    @OneToMany (mappedBy = "codigo_usuario")
    private List<Chat> chats;
}

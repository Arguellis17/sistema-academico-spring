package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoNotificacion; // Clave primaria de tipo Long

    private String mensaje;
    private Date fechaEnvio;
    private String tipo;
    private String estado = "No Leída";

    @ManyToOne
    @JoinColumn(name = "codigo_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "codigo_destinatario")
    private Usuario destinatario;
}

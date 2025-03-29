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

    // Relación con el usuario que envía la notificación
    @ManyToOne
    @JoinColumn(name = "codigo_usuario", nullable = false)
    private Usuario usuario;

    // Relación con el usuario que recibe la notificación
    @ManyToOne
    @JoinColumn(name = "codigo_destinatario", nullable = false)
    private Usuario destinatario;
}

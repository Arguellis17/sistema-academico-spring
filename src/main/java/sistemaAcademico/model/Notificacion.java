package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoNotificacion;

    @Column(nullable = false)
    private String tipo; // Ej: RECORDATORIO_EVALUACION, ANUNCIO_GENERAL, NOTA_PUBLICADA

    @Column(nullable = false)
    private String mensaje;

    @Column(nullable = false)
    private LocalDateTime fechaEnvio;

    private LocalDateTime fechaLectura;

    private boolean leido = false;

    private Long codigoUsuarioDestino;

    private String nombreUsuarioDestino;

    // Relación con el usuario que envía la notificación
    @ManyToOne
    @JoinColumn(name = "codigo_usuario", nullable = false)
    private Usuario usuario;

    public Notificacion(String tipo, String mensaje, LocalDateTime fechaEnvio, Long codigoUsuarioDestino, String nombreUsuarioDestino, Usuario usuario) {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
        this.codigoUsuarioDestino = codigoUsuarioDestino;
        this.nombreUsuarioDestino = nombreUsuarioDestino;
        this.usuario = usuario;
        this.leido = false;
    }
}

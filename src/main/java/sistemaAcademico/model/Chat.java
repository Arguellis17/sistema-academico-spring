package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoChat;
    private Date fechaCreacion;

    @ManyToOne(optional=false)
    @JoinColumn(name = "codigo_usuario1", nullable = false)
    private Usuario codigoUsuario1;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_usuario2",nullable = false)
    private Usuario codigoUsuario2;
}

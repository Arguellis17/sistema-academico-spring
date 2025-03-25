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

    @ManyToOne
    @JoinColumn(name = "codigo_usuario1")
    private Usuario codigoUsuario1;

    @ManyToOne
    @JoinColumn(name = "codigo_usuario2")
    private Usuario codigoUsuario2;
}

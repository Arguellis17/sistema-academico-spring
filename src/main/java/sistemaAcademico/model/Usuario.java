package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    private Long codigoUsuario;

    private String personaDocumento;
    private String nombre;
    private String clave;

    @ManyToOne
    @JoinColumn(name = "codigo_rol")
    private Rol rol;

    private boolean sesionActiva;
}

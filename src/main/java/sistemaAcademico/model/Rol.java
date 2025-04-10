package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoRol;

    private String nombre;
    private String tipoRol;

    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuarios;
}

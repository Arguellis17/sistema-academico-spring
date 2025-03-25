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
    private Long codigoRol;

    private String nombre;
    private String tipoRol;
}

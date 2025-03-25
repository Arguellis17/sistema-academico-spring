package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Foro {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigoForo;
    @ManyToOne
    private Curso codigoCurso;

    private String titulo;
    private String descripcion;
    private Date fechaCreacion;

    @ManyToMany
    private List<Usuario> codigoUsuario;
}

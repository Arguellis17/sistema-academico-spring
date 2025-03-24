package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoDepartamento;
    private String nombre;

    @ManyToOne
    private Facultad facultad;

    @OneToMany(mappedBy = "departamento")
    private List<Docente> docentes;
}

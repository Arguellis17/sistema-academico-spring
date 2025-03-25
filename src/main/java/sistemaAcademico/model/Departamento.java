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

    // Una facultad tiene muchos departamentos
    // La anotacion many to one indica que muchos departamentos pertenecen a una facultad
    @ManyToOne
    private Facultad facultad;

    @OneToMany
    private List<Docente> docentes;
}

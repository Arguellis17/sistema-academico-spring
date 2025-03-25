package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Docente extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoDocente;

    @ManyToOne
    private Departamento departamento;

    private String titulo;
    private String especializacion;
    private int cargaHoraria;

    @OneToMany
    private List<AsignacionDocente> asignaciones;

    @OneToMany
    private List<Evaluacion> historialEvaluaciones;
}

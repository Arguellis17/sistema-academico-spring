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
    private String codigoDocente;

    @ManyToOne
    @JoinColumn(name = "codigo_departamento")
    private Departamento departamento;

    private String titulo;
    private String especializacion;
    private int cargaHoraria;

    @OneToMany(mappedBy = "docente")
    private List<AsignacionDocente> asignaciones;

    @OneToMany(mappedBy = "docente")
    private List<Evaluacion> historialEvaluaciones;
}

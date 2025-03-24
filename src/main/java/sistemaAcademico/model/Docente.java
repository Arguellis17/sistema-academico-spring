package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Docente extends Persona{

    private String codigoDocente;

    @ManyToOne
    private Departamento departamento;

    private String titulo;
    private String especializacion;
    private int cargaHoraria;

    @OneToMany(mappedBy = "docente")
    private List<Curso> cursosAsignados;

    @OneToMany(mappedBy = "docente")
    private List<Evaluacion> historialEvaluaciones;
}

package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo_evaluacion;
    private String tipo;
    private float ponderacion;

    @OneToOne
    @JoinColumn(name = "codigo_curso")
    private Curso codigoCurso;

    private Date fechaEvaluacion;

    // Agregando la relacion con Calificacion
    @OneToMany(mappedBy = "codigo_evaluacion")
    private List<Calificacion> calificaciones;
}

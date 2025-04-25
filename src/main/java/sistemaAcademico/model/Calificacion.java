package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCalificacion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codigoEstudiante",nullable = false)
    private Estudiante codigoEstudiante;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_evaluacion",nullable = false)
    private Evaluacion codigo_evaluacion;

    private float nota;

}



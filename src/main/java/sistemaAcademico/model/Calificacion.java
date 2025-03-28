package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCalificacion;
    private float nota;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_estudiante",nullable = false)
    private Estudiante codigoEstudiante;
    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_evaluacion",nullable = false)
    private Evaluacion codigoEvaluacion;
}



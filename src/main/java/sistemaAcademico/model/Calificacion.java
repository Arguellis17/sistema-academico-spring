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
    @OneToMany
    private List<Estudiante> codigoEstudiante;
    @OneToMany
    private Evaluacion codigoEvaluacion;
}



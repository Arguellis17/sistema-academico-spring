package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_evaluacion")
    private Evaluacion evaluacion;

    private float nota;
}

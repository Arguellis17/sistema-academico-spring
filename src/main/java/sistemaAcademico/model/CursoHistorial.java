package sistemaAcademico.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CursoHistorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCursoHistorial;

    @ManyToOne
    @JoinColumn(name = "codigo_historial_academico")
    private HistorialAcademico historialAcademico;

    @ManyToOne
    @JoinColumn(name = "codigo_curso")
    private Curso curso;

    @Enumerated(EnumType.STRING)
    private EstadoCurso estadoCurso;

    private float calificacionFinal;

}

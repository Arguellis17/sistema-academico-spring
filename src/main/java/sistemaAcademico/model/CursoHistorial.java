package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.*;

public class CursoHistorial {
    @Id
    private Long codigoCursoHistorial; // Clave primaria de tipo Long

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

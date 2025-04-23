package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCurso;
    private String nombre;
    private int creditos;
    private int horasTeoricas;
    private int horasPracticas;
    @ManyToMany
    @JoinTable(
            name = "curso_estudiante",
            joinColumns = @JoinColumn(name = "codigo_curso"),
            inverseJoinColumns = @JoinColumn(name = "codigo_estudiante")
    )
    private List<Estudiante> estudiantes;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codigo_docente", nullable = false)
    private Docente codigoDocente;

    @ManyToMany
    @JoinTable(
            name = "curso_carrera", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name="codigo_curso"), // Clave foranea hacia curso
            inverseJoinColumns = @JoinColumn(name="codigo_carrera") // Clave foranea hacia carrera
    )
    private List<Carrera> codigoCarrera;

    @OneToOne
    @JoinColumn(name = "codigo__pre_requisito", referencedColumnName = "codigo_curso")
    private Curso preRequisito;

    @ManyToMany
    @JoinTable (
            name = "curso_programa", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name="codigo_curso"), // Clave foranea hacia curso
            inverseJoinColumns = @JoinColumn(name="codigo_programa") // Clave foranea hacia programa
    )
    private List<Programa> codigoPrograma;

    @ManyToOne
    @JoinColumn(name = "codigo_semestre", nullable = false)
    private Semestre codigoSemestre;

    private String tipoCurso;
    private String contenido;
    private String objetivo;
    private String competencia;

    // Agregando la relación con AsignacionDocente
    @OneToMany(mappedBy = "curso")
    private List<AsignacionDocente> asignaciones;

    // Agregando la relación con CursoHistorial
    @OneToMany(mappedBy = "curso")
    private List<CursoHistorial> cursoHistorial;

    // Agregando la relacion con Evaluacion
    @OneToOne(mappedBy = "codigo_curso")
    private Evaluacion evaluacion;

    // Agregando la relacion con Foro
    @OneToMany(mappedBy = "codigoCurso")
    private List<Foro> foros;

    // Agregando la relacion con Horario
    @OneToMany(mappedBy = "codigo_curso")
    private List<Horario> horarios;

    // Agregando la relacion con Matricula
    @ManyToOne
    private Matricula matricula;

}


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
    private int codigoCurso;
    private String nombre;
    private int creditos;
    private int horasTeoricas;
    private int horasPracticas;
    @ManyToMany
    private List<Docente> codigoDocente;
    @ManyToMany
    private List<Carrera> codigoCarrera;
    @OneToOne
    private Curso preRequisito;
    @ManyToMany
    private List<Programa> codigoPrograma;
    @OneToOne
    private Semestre codigoSemestre;
    private String tipoCurso;
    private String contenido;
    private String objetivo;
    private String competencia;
}

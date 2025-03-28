package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

/*
La anotacion @JoinTable se utiliza para crear y personalizar una tabla intermedia
en una relacion de muchos a muchos entre dos entidades.

 */

public class Asistencia {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigoAsistencia;

    @OneToMany
    @JoinTable(
            name = "asistencia_estudiante", //Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "codigo_asistencia"), // Clave foranea hacia asistencia
            inverseJoinColumns = @JoinColumn(name = "codigo_estudiante") // Clave foranea hacia estudiante
    )
    private List<Estudiante> codigoEstudiante;

    @ManyToOne (optional = false)
    @JoinColumn(name = "codigo_curso",nullable = false )
    private Curso codigoCurso;

    private Date fechaAsistencia;
    private boolean asistencia;

}

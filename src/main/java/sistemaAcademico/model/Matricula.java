package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoMatricula;
    private Date fechaMatricula;
    @OneToMany
    private Curso codigoCurso;
    @ManyToMany
    private Estudiante codigoEstudiante;

}

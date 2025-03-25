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

public class Asistencia {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigoAsistencia;
    @OneToMany
    private List<Estudiante> codigoEstudiante;
    @ManyToOne
    private Curso codigoCurso;
    private Date fechaAsistencia;
    private boolean asistencia;

}

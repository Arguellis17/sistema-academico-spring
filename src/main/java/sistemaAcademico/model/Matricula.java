package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
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

    @ManyToMany
    @JoinTable(name = "matricula_curso", joinColumns = @JoinColumn(name = "codigo_matricula"),
            inverseJoinColumns = @JoinColumn(name = "codigo_curso"))
    private List<Curso> codigoCurso;

    @OneToOne
    @JoinColumn (name = "codigo_estudiante")
    private Estudiante codigoEstudiante;

}

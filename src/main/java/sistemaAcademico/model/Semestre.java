package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Semestre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoSemestre;
    private int numeroSemestre;
    private Date fechaInicio;
    private Date fechaFin;

    // Agregando relacion con Curso
    @OneToOne(mappedBy = "codigoSemestre")
    private Curso cursos;
}

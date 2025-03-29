package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistorialAcademico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigoHistorialAcademico;
    private float promedioGeneral;
    @ManyToOne
    private Estudiante codigoEstudiante;

    // Agregando la relación con CursoHistorial
    @OneToMany(mappedBy = "historial_academico")
    private List<CursoHistorial> cursoHistorial;
}

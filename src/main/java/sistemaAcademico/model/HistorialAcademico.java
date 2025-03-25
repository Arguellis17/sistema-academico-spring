package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
}

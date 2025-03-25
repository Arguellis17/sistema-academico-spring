package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsignacionDocente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoAsignacionDocente;
    private Date fecha;
    private int cargaHoraria;

    @ManyToOne
    @JoinColumn(name = "codigo_docente")
    private Docente docente;

    @ManyToOne
    @JoinColumn(name = "codigo_curso")
    private Curso curso;

}

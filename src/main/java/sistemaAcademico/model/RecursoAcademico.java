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

public class RecursoAcademico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigoRecursoAcademico;
    private String titulo;
    private String tipo;

    @ManyToMany(mappedBy = "recursosAcademicos")
    private List<Curso> codigoCurso;

    private String nombreRecursoAcademico;
    private boolean disponible;
    private String ubicacion;
    private String tipoEspacio;
}

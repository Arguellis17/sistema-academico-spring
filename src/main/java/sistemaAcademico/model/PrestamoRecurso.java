package sistemaAcademico.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrestamoRecurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoPrestamoRecurso;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    @ManyToOne
    @JoinColumn(name = "codigo_recurso")
    private RecursoAcademico recurso;

    @ManyToOne
    @JoinColumn(name = "codigo_usuario")
    private Usuario usuario;
}

package sistemaAcademico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoPrograma;
    private String nombre;
    private String descripcion;
    @OneToMany
    private Carrera codigoCarrera;

}

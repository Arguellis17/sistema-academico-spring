package sistemaAcademico.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public enum EstadoCurso {
    APROBADO,
    REPROBADO,
    EN_CURSO,
    RETIRADO
}

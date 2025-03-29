package sistemaAcademico.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

/*
  Explicacion de etiquetas

    @Entity: Indica que la clase es una entidad, es decir, una tabla de la base de datos
    @Data: Anotación de Lombok que genera los métodos getter, setter, equals, hashcode y toString
    @NoArgsConstructor: Anotación de Lombok que genera un constructor sin argumentos
    @AllArgsConstructor: Anotación de Lombok que genera un constructor con todos los argumentos

    @Id: Indica que el atributo es la clave primaria de la tabla
    @GeneratedValue: Indica que el valor de la clave primaria se generará automáticamente
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Estudiante extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEstudiante;
    // @ManyToOne: Indica que la relación es de muchos a uno
    @ManyToOne
    private Carrera codigoCarrera;

    private int semestre;

    //  Agregando la relación con calificacion
    @OneToMany(mappedBy = "estudiante")
    private List<Calificacion> calificaciones;


}

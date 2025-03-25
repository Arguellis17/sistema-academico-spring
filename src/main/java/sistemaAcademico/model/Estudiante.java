package sistemaAcademico.model;

import sistemaAcademico.model.Carrera;
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
public class Estudiante extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEstudiante;
    // @ManyToOne: Indica que la relación es de muchos a uno
    @ManyToOne
    private Carrera codigoCarrera;
    private int semestre;


}

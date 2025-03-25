package sistemaAcademico.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// El Data es un atajo de Lombok que genera los métodos getter, setter, equals, hashcode y toString
@Data
// Anotaciones para indicar un constructor vacio y uno lleno
@NoArgsConstructor
@AllArgsConstructor
// Indica que la clase es una entidad, es decir, una tabla de la base de datos
@Entity
public class Carrera {

    // Indica que el identificador de la tabla es codigoCarrera
    @Id
    // Esto indica que el atributo es la clave primaria de la tabla y manejara autoincremento
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCarrera;

    // Preguntarle al profesor si eso se pone XDDDDDDD
    
    // Indica que la relación es de uno a muchos
    //@OneToMany(mappedBy = "codigoCarrera")
    // Lista de estudiantes
    //private List<Estudiante> estudiantes;

    private String nombreCarrera;
    private int duracion;
    //private Departamento codigoDepartamento;
}

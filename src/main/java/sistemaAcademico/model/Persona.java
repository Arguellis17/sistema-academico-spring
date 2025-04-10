package sistemaAcademico.model;

import jakarta.persistence.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass

/*
    La anotacion @MappedSuperclass indica que esta clase es una superclase
    y que no se puede instanciar, pero si se puede heredar.
    
    Usada unicamente para definirla como una clase padre
 */

// Se especifico como abstract ya que no se va a instanciar, solo se usan sus
// atributos y metodos
public abstract class Persona {

    // Ya no es una clave primaria, sino un atributo
    private Long documento;

    // Se especifia que es un enum de tipo TipoDocumento
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;
}

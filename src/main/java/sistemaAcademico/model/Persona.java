package sistemaAcademico.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documento;

    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;
}

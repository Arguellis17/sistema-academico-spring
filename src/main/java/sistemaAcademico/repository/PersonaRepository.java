package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Persona;

import java.util.Date;
import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    //public List<Persona> findByNombre(String nombre);

    //public List<Persona> findByCorreo(String correo);

    //public List<Persona> findByTelefono(String telefono);

    //public List<Persona> findByDireccion(String direccion);

    //public List<Persona> findByFechaNacimiento(Date fechaNacimiento);

}

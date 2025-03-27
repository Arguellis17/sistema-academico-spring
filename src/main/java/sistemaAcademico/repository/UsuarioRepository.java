package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //public List<Usuario> findByPersonaDocumento(String personaDocumento);

    //public List<Usuario> findByNombre(String nombre);

    //public List<Usuario> findByClave(String clave);

    //public List<Usuario> findBySesionActiva(boolean sesionActiva);

}

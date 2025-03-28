package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Usuario;

@Service
public interface UsuarioService extends CrudService<Usuario, Long> {

    //public List<Usuario> findByPersonaDocumento(String personaDocumento);

    //public List<Usuario> findByNombre(String nombre);

    //public List<Usuario> findByClave(String clave);

    //public List<Usuario> findBySesionActiva(boolean sesionActiva);

}

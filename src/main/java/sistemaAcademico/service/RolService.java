package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Rol;

@Service
public interface RolService extends CrudService<Rol, Long>{
    /*public List<Rol> findByNombre(String nombre);

    public List<Rol> findByTipoRol(String tipoRol);*/
}

package sistemaAcademico.service;

import sistemaAcademico.model.Rol;

import java.util.List;

public interface RolService extends CrudService<Rol, Long>{
    public List<Rol> findByNombre(String nombre);

    public List<Rol> findByTipoRol(String tipoRol);
}

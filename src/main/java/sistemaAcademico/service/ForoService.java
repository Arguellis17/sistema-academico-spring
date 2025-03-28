package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Foro;

@Service
public interface ForoService extends CrudService<Foro, Long> {

    //public List<Foro> findByTitulo(String titulo);

    //public List<Foro> findByDescripcion(String descripcion);

    //public List<Foro> findByfechaCreacion(Date fechaCreacion);

}

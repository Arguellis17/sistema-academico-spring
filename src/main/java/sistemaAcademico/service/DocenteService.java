package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Docente;

import java.util.List;

@Service
public interface DocenteService extends CrudService<Docente, Long>{
    public List<Docente> findByTitulo(String titulo);

    public List<Docente> findByEspecializacion(String especializacion);

    public List<Docente> findByCargaHoraria(int cargaHoraria);
}

package sistemaAcademico.service;

import sistemaAcademico.model.Docente;

import java.util.List;

public interface DocenteService extends CrudService<Docente, Long>{
    public List<Docente> findByTitulo(String titulo);

    public List<Docente> findByEspecializacion(String especializacion);

    public List<Docente> findByCargaHoraria(int cargaHoraria);
}

package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.RecursoAcademico;

import java.util.List;

@Service
public interface RecursoAcademicoService extends CrudService<RecursoAcademico, Long> {

    public List<RecursoAcademico> findByTitulo(String titulo);

    public List<RecursoAcademico> findByTipo(String tipo);

    public List<RecursoAcademico> findByNombreRecursoAcademico(String nombreRecursoAcademico);

    public List<RecursoAcademico> findByDisponible(boolean disponible);

    public List<RecursoAcademico> findByUbicacion(String ubicacion);

    public List<RecursoAcademico> findByTipoEspacio(String tipoEspacio);
}

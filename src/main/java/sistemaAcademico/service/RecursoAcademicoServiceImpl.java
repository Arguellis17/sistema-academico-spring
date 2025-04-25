package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.RecursoAcademico;
import sistemaAcademico.repository.RecursoAcademicoRepository;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecursoAcademicoServiceImpl implements RecursoAcademicoService {

    @Autowired
    private RecursoAcademicoRepository recursoAcademicoRepository;

    @Override
    public RecursoAcademico save(RecursoAcademico entity) {
        return recursoAcademicoRepository.save(entity);
    }

    @Override
    public List<RecursoAcademico> findAll() {
        return recursoAcademicoRepository.findAll();
    }

    @Override
    public Optional<RecursoAcademico> findById(Long id) {
        return recursoAcademicoRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        recursoAcademicoRepository.deleteById(id);
    }
    @Override
    public void deleteAll() throws Exception {
        recursoAcademicoRepository.deleteAll();
    }

    @Override
    public List<RecursoAcademico> findByTitulo(String titulo) {
        return recursoAcademicoRepository.findByTitulo(titulo);
    }

    @Override
    public List<RecursoAcademico> findByTipo(String tipo) {
        return recursoAcademicoRepository.findByTipo(tipo);
    }

    @Override
    public List<RecursoAcademico> findByNombreRecursoAcademico(String nombreRecursoAcademico) {
        return recursoAcademicoRepository.findByNombreRecursoAcademico(nombreRecursoAcademico);
    }

    @Override
    public List<RecursoAcademico> findByDisponible(boolean disponible) {
        return recursoAcademicoRepository.findByDisponible(disponible);
    }

    @Override
    public List<RecursoAcademico> findByUbicacion(String ubicacion) {
        return recursoAcademicoRepository.findByUbicacion(ubicacion);
    }

    @Override
    public List<RecursoAcademico> findByTipoEspacio(String tipoEspacio) {
        return recursoAcademicoRepository.findByTipoEspacio(tipoEspacio);
    }

    @Override
    public RecursoAcademico update(RecursoAcademico recurso) throws Exception {
        if (recurso.getCodigoRecursoAcademico() == null || !recursoAcademicoRepository.existsById(recurso.getCodigoRecursoAcademico())) {
            throw new Exception("Recurso no encontrado para actualizar");
        }
        return recursoAcademicoRepository.save(recurso);
    }
}

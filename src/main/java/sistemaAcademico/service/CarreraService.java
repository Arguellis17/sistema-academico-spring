package sistemaAcademico.service;

import sistemaAcademico.model.Carrera;

import java.util.List;

public interface CarreraService extends CrudService<Carrera, Long> {

    public List<Carrera> findByNombreCarrera(String nombreCarrera);

    public List<Carrera> findByDuracion(int duracion);
}

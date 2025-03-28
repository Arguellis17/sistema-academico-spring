package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Carrera;

@Service
public interface CarreraService extends CrudService<Carrera, Long> {

    /*public List<Carrera> findByNombreCarrera(String nombreCarrera);

    public List<Carrera> findByDuracion(int duracion);*/
}

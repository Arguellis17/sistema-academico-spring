package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.AsignacionDocente;

@Service
public interface AsignacionDoncenteService extends CrudService<AsignacionDocente,Long>{
    //public List<AsignacionDocente> findByFecha(Date fecha);

    //public List<AsignacionDocente> findByCargaHoraria(int cargaHoraria);
}

package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.AsignacionDocente;

import java.util.Date;
import java.util.List;

@Service
public interface AsignacionDoncenteService extends CrudService<AsignacionDocente,Long>{
    //public List<AsignacionDocente> findByFecha(Date fecha);

    //public List<AsignacionDocente> findByCargaHoraria(int cargaHoraria);
    List<AsignacionDocente> findByFecha(Date fecha);

    List<AsignacionDocente> findByCargaHoraria(int cargaHoraria);
}

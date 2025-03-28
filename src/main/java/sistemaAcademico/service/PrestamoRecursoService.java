package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.PrestamoRecurso;

@Service
public interface PrestamoRecursoService extends CrudService<PrestamoRecurso, Long> {

    //public List<PrestamoRecurso> findByFechaPrestamo(Date fechaPrestamo);

    //public List<PrestamoRecurso> findByFechaDevolucion(Date fechaDevolucion);
}

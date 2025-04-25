package sistemaAcademico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.PrestamoRecurso;
import sistemaAcademico.repository.PrestamoRecursoRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PrestamoRecursoServiceImpl implements PrestamoRecursoService {

    @Autowired
    private PrestamoRecursoRepository prestamoRecursoRepository;

    @Override
    public List<PrestamoRecurso> findAll() throws Exception {
        return prestamoRecursoRepository.findAll();
    }

    @Override
    public PrestamoRecurso save(PrestamoRecurso prestamo) throws Exception {
        return prestamoRecursoRepository.save(prestamo);
    }

    @Override
    public PrestamoRecurso update(PrestamoRecurso prestamo) throws Exception {
        if (prestamo.getCodigoPrestamoRecurso() == null ||
                !prestamoRecursoRepository.existsById(prestamo.getCodigoPrestamoRecurso())) {
            throw new Exception("El préstamo no existe o no tiene ID válido");
        }
        return prestamoRecursoRepository.save(prestamo);
    }

    @Override
    public Optional<PrestamoRecurso> findById(Long id) throws Exception {
        return prestamoRecursoRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        prestamoRecursoRepository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        prestamoRecursoRepository.deleteAll();
    }

    @Override
    public List<PrestamoRecurso> findByFechaPrestamo(Date fechaPrestamo) {
        return prestamoRecursoRepository.findByFechaPrestamo(fechaPrestamo);
    }

    @Override
    public List<PrestamoRecurso> findByFechaDevolucion(Date fechaDevolucion) {
        return prestamoRecursoRepository.findByFechaDevolucion(fechaDevolucion);
    }
}

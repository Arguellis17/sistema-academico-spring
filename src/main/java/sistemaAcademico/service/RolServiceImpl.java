package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Rol;
import sistemaAcademico.repository.RolRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RolServiceImpl implements RolService{

    private final RolRepository rolRepository;

    @Override
    public List<Rol> findAll() throws Exception {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> findById(Long id) throws Exception {
        return rolRepository.findById(id);
    }

    @Override
    public Rol save(Rol entity) throws Exception {
        return rolRepository.save(entity);
    }

    @Override
    public Rol update(Rol entity) throws Exception {
        return rolRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        rolRepository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        rolRepository.deleteAll();
    }

    @Override
    public List<Rol> findByNombre(String nombre) throws Exception {
        return rolRepository.findByNombre(nombre);
    }

    @Override
    public List<Rol> findByTipoRol(String tipoRol) throws Exception {
        return rolRepository.findByTipoRol(tipoRol);
    }
}

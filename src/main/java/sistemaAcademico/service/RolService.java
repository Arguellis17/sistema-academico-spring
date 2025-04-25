package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Rol;
import sistemaAcademico.model.Usuario;
import sistemaAcademico.repository.RolRepository;
import sistemaAcademico.repository.UsuarioRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RolService {

    private final UsuarioRepository usuarioRepository;
    private final RolRepository rolRepository;

    public void asignarRol(Long codigoUsuario, Long codigoRol) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(codigoUsuario);
        Optional<Rol> rolOpt = rolRepository.findById(codigoRol);

        if (usuarioOpt.isEmpty()) {
            throw new RuntimeException("Usuario no encontrado con código: " + codigoUsuario);
        }
        if (rolOpt.isEmpty()) {
            throw new RuntimeException("Rol no encontrado con código: " + codigoRol);
        }

        Usuario usuario = usuarioOpt.get();
        Rol rol = rolOpt.get();

        usuario.setRol(rol);
        usuarioRepository.save(usuario);
    }
}

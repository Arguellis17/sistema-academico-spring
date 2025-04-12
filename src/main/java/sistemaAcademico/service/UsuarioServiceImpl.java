package sistemaAcademico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistemaAcademico.model.Usuario;
import sistemaAcademico.repository.UsuarioRepository;
import sistemaAcademico.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() throws Exception {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) throws Exception {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario save(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public Usuario update(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        usuarioRepository.deleteAll();
    }

    // ========== MÉTODOS PERSONALIZADOS ==========

    @Override
    public void iniciarSesion(Long idUsuario) throws Exception {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new Exception("Usuario no encontrado"));
        usuario.setSesionActiva(true);
        usuarioRepository.save(usuario);
    }

    @Override
    public void cerrarSesion(Long idUsuario) throws Exception {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new Exception("Usuario no encontrado"));
        usuario.setSesionActiva(false);
        usuarioRepository.save(usuario);
    }

    @Override
    public boolean autenticar(Long idUsuario, String contrasena) throws Exception {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new Exception("Usuario no encontrado"));
        return usuario.getClave().equals(contrasena);
    }

    @Override
    public void cambiarContrasena(Long idUsuario, String nuevaContrasena) throws Exception {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new Exception("Usuario no encontrado"));
        usuario.setClave(nuevaContrasena);
        usuarioRepository.save(usuario);
    }

    @Override
    public void recuperarContrasena(Long idUsuario) throws Exception {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new Exception("Usuario no encontrado"));
        // Simulación de recuperación de contraseña (en sistemas reales se enviaría un correo)
        String contrasenaTemporal = "temp123";
        usuario.setClave(contrasenaTemporal);
        usuarioRepository.save(usuario);
        // Podrías agregar aquí lógica para enviar notificación o correo si se implementa
    }

    @Override
    public Usuario buscarPorDocumento(String documento) throws Exception {
        return usuarioRepository.findByPersonaDocumento(documento)
                .orElseThrow(() -> new Exception("Usuario no encontrado con documento: " + documento));
    }

    @Override
    public List<Usuario> buscarPorNombre(String nombre) throws Exception {
        return usuarioRepository.findByNombre(nombre);
    }

    @Override
    public List<Usuario> buscarPorSesionActiva(boolean estado) throws Exception {
        return usuarioRepository.findBySesionActiva(estado);
    }

    @Override
    public Usuario buscarPorNombreYClave(String nombre, String clave) throws Exception {
        return usuarioRepository.findByNombreAndClave(nombre, clave)
                .orElseThrow(() -> new Exception("Usuario no encontrado o credenciales incorrectas"));
    }
}

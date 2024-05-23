package com.project.ecommerce.services;

import com.project.ecommerce.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario createUsuario(Usuario usuario);
    Usuario updateUsuario(Long id, Usuario usuarioActualizado);
    Optional<Usuario> getUsuarioById(Long id, Usuario usuario);
    List<Usuario> getUsuarios();
    void deleteUsuario(Long id);
}

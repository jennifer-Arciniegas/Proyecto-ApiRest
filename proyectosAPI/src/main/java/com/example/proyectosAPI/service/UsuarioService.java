package com.example.proyectosAPI.service;

import com.example.proyectosAPI.model.Usuario;
import com.example.proyectosAPI.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository userRepository;

    public List<Usuario> getAllUsuarios(){
        return userRepository.findAll();
    }

    public Usuario getUsuarioById(long id){
        return userRepository.findById(id).orElse(null);
    }

    public Usuario createUsuario(Usuario usuario){
        return userRepository.save(usuario);
    }

    public Usuario updateUsuario(Long id,Usuario usuario) {
        usuario.setId(id);
        return userRepository.save(usuario);
    }
    public void deleteUsuario(Long id){
        userRepository.deleteById(id);
    }
}

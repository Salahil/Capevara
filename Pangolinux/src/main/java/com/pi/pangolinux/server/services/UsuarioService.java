package com.pi.pangolinux.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.pangolinux.back.actorsModels.UsuarioModel;
import com.pi.pangolinux.server.repos.UsuarioRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioModel save(UsuarioModel usuario) {
        // Adicione lógica de validação ou manipulação, se necessário
        return usuarioRepository.save(usuario);
    }

    public List<UsuarioModel> getAll() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> findById(UUID id) {
        return usuarioRepository.findById(id);
    }
}

package com.pi.pangolinux.back.app.exe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.pangolinux.back.app.exe.models.UsuarioModel;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
    // Adicione métodos de consulta específicos, se necessário
}

package com.project.pangolinux.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pangolinux.modelos.UsuarioModel;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
    // Adicione métodos de consulta específicos, se necessário
}


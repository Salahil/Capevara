package com.pi.pangolinux.back.app.exe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.pangolinux.back.app.exe.models.EnderecoModel;

import java.util.UUID;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, UUID> {
    // Adicione métodos de consulta específicos, se necessário
}
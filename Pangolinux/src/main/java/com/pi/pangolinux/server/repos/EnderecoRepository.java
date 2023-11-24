package com.pi.pangolinux.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.pangolinux.back.objectsModels.EnderecoModel;

import java.util.UUID;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, UUID> {
    // Adicione métodos de consulta específicos, se necessário
}
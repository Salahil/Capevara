package com.pi.pangolinux.server.repos;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pi.pangolinux.back.objectsModels.DenunciaDenModel;

public interface DenunciaDenRepository extends JpaRepository<DenunciaDenModel, UUID> {
    Optional<DenunciaDenModel> findByProtocolo(String protocolo);
}
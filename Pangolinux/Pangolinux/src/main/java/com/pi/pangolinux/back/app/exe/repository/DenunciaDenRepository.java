package com.pi.pangolinux.back.app.exe.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pi.pangolinux.back.app.exe.models.DenunciaDenModel;

public interface DenunciaDenRepository extends JpaRepository<DenunciaDenModel, String> {
    Optional<DenunciaDenModel> findByProtocolo(String protocolo);
}
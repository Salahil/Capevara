package com.pi.pangolinux.back.app.exe.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.pangolinux.back.app.exe.models.DenunciaAnaliModel;

@Repository
public interface DenunciaAnaliRepository extends JpaRepository<DenunciaAnaliModel, String> {
    // Adicione métodos de consulta específicos, se necessário
}

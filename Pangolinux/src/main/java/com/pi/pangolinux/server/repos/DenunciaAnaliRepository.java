package com.pi.pangolinux.server.repos;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.pangolinux.back.objectsModels.DenunciaAnaliModel;

@Repository
public interface DenunciaAnaliRepository extends JpaRepository<DenunciaAnaliModel, String> {
    // Adicione métodos de consulta específicos, se necessário
}

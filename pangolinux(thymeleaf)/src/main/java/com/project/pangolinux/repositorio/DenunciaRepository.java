package com.project.pangolinux.repositorio;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pangolinux.modelos.DenunciaModel;

@Repository
public interface DenunciaRepository extends JpaRepository<DenunciaModel, UUID> {

	List<DenunciaModel> findByCpfUsuario(String cpf);

	List<DenunciaModel> findAllByCpfUsuario(String cpf);

}


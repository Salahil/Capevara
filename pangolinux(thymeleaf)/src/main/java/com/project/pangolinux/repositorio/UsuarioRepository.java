package com.project.pangolinux.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pangolinux.modelos.UsuarioModel;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

	Optional<UsuarioModel> findByCpfAndSenha(String cpf, String senha);

	UsuarioModel findByCpf(String cpfUsuarioLogado);
}


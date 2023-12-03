package com.project.pangolinux.repositorio;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pangolinux.modelos.EnderecoModel;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, UUID>{

}

package com.project.pangolinux.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	
	public UsuarioModel findByCpf(String cpf) {
		return repo.findByCPF(cpf).get(0);
	}
}
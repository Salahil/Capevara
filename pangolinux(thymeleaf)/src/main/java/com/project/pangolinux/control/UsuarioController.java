package com.project.pangolinux.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.UsuarioRepository;


@Controller
public class UsuarioController {

	@Autowired
	UsuarioRepository repo;
	
	@PostMapping("/addUsuario")
	public void addPerson(@RequestBody UsuarioModel usuario) {
		repo.save(usuario);
	}
}

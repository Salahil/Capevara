package com.project.pangolinux.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioRepository repo;
	
	@PostMapping("/addUsuario")
	public void addPerson(@RequestBody UsuarioModel usuario) {
		repo.save(usuario);
	}
}

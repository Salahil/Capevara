package com.project.pangolinux.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pangolinux.modelos.EnderecoModel;
import com.project.pangolinux.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	
	@Autowired
	EnderecoRepository repo;
	
	@PostMapping("/addEndereco")
	public void addEnderco(@RequestBody EnderecoModel endereco) {
		this.repo.save(endereco);
	}
}

package com.project.pangolinux.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.repository.DenunciaRepository;

@RestController
@RequestMapping("/denuncia")
public class DenunciaController {

	@Autowired
	DenunciaRepository repo;
	
	@PostMapping("/addDenuncia")
	public void addDenuncia(@RequestBody DenunciaModel denuncia) {
		repo.save(denuncia);
	}
}

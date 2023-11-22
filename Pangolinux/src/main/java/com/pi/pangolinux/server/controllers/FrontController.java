package com.pi.pangolinux.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
	
	@GetMapping
	public String frontCadastro() {
		return "Cadastro";
	}
}

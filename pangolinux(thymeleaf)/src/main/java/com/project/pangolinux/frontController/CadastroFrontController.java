package com.project.pangolinux.frontController;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pangolinux.modelos.UsuarioModel;

@Controller
public class CadastroFrontController {
	
	@GetMapping({"/cadastro", "/"})
	public String telaCadastro() {
		return "cadastro";
	}	
}
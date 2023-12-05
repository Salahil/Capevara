package com.project.pangolinux.frontController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.repositorio.DenunciaRepository;
import com.project.pangolinux.repositorio.EnderecoRepository;
import com.project.pangolinux.repositorio.UsuarioRepository;

@Controller
public class CriarDenunciaFrontController {
	
	@Autowired
	DenunciaRepository repoDen;
	
	@Autowired
	UsuarioRepository repoUser;
	
	@Autowired
	EnderecoRepository repoEnd;
	
	@GetMapping("/denunciaUsuario")
	public String telaCriarDenuncia(Model model) {
		model.addAttribute("denuncia", new DenunciaModel());
		return "denunciausuario";
	}
}
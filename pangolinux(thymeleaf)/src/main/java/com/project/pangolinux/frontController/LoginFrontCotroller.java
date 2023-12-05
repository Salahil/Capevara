package com.project.pangolinux.frontController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.UsuarioRepository;

@Controller
public class LoginFrontCotroller {
	
	@Autowired
	UsuarioRepository repo;
	
	@GetMapping("/login")
    public String telaLogin() {
        return "login";
    }
	
	@PostMapping("/login")
    public String realizarLogin(@RequestParam String cpf, @RequestParam String senha, Model model) {
		if (cpf == null) return "redirect:/denunciaUsuario";
		UsuarioModel usuario = (UsuarioModel) repo.findByCPF(cpf);
		
        if (usuario != null && usuario.getSenha().equals(senha)) {
            model.addAttribute("mensagem", "Login bem-sucedido para o usuário: " + cpf);
            if (!usuario.getTipoUsuario()) return "redirect/listaDenunciaUsuario";
            if (usuario.getTipoUsuario()) return "redirect/listaDenunciaAnalista";
        }
        model.addAttribute("mensagem", "Falha na autenticação. Verifique CPF e senha.");
        return "paginaDeFalha";    
    }
}
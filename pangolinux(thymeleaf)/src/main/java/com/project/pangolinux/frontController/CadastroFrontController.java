package com.project.pangolinux.frontController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.UsuarioRepository;

@Controller
public class CadastroFrontController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping({"/cadastro", "/"})
    public String telaCadastro(Model model) {
        model.addAttribute("usuario", new UsuarioModel());
        return "cadastro";
    }

    @PostMapping("/cadastrarUsuario")
    public String cadastrarUsuario(@ModelAttribute UsuarioModel usuario, Model model) {
        // Lógica de validação
        if (usuario.getCPF() == null || usuario.getCPF().isEmpty()) {
            model.addAttribute("error", "CPF é obrigatório");
            return "cadastro"; // Retorna para o formulário com mensagem de erro
        }

        // Lógica para salvar no banco de dados
        usuarioRepository.save(usuario);

        // Redireciona para a página de sucesso ou outra ação necessária
        return "redirect:/login";
    }
}


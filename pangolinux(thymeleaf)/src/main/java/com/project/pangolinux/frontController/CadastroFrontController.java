package com.project.pangolinux.frontController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.UsuarioRepository;

@Controller
@RequestMapping({"/cadastro", "/"})
public class CadastroFrontController {

    @Autowired
    private UsuarioRepository repo;

    @GetMapping
    public String exibirFormularioCadastro(Model model) {
        model.addAttribute("usuario", new UsuarioModel());
        return "cadastro";
    }

    @PostMapping
    public String cadastrarUsuario(@ModelAttribute("usuario") UsuarioModel usuario) {
        // Lógica para salvar no banco de dados
        // Certifique-se de definir o valor do campo "analista" de acordo com a lógica do seu sistema
        repo.save(usuario);
        return "redirect:/login";
    }
}

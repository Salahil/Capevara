package com.project.pangolinux.frontController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.UsuarioRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginFrontCotroller {

    @Autowired
    private UsuarioRepository repo;

    @GetMapping
    public String exibirFormularioLogin(Model model) {
        model.addAttribute("usuario", new UsuarioModel());
        return "login";
    }

    @PostMapping
    public String realizarLogin(@ModelAttribute("usuario") UsuarioModel usuario, HttpSession session, Model model) {
        // Lógica para verificar o login
        Optional<UsuarioModel> usuarioOptional = repo.findByCpfAndSenha(usuario.getCPF(), usuario.getSenha());

        if (usuarioOptional.isPresent()) {
            UsuarioModel usuarioLogado = usuarioOptional.get();
            session.setAttribute("usuarioLogado", usuarioLogado);

            // Redirecionamento com base no tipo de usuário (analista ou não)
            if (usuarioLogado.isAnalista()) {
                return "redirect:/visualizarDenunciaAnalista";
            } else {
                return "redirect:/visualizarDenunciaUsuario";
            }
        } else {
            model.addAttribute("mensagemErro", "Usuário ou senha inválidos");
            return "login";
        }
    }
}

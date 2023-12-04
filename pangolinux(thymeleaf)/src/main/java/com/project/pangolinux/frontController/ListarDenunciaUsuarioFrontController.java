package com.project.pangolinux.frontController;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.DenunciaRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/denunciaUsuario")
public class ListarDenunciaUsuarioFrontController {

    @Autowired
    private DenunciaRepository repo;

    @GetMapping
    public String listarDenunciasUsuario(Model model, HttpSession session) {
        // Lógica para obter as denúncias do usuário logado
        // Você pode usar o CPF do usuário obtido da sessão para filtrar as denúncias
        String cpfUsuario = (String) session.getAttribute("cpfUsuario");
        List<DenunciaModel> denuncias = repo.findByCpfUsuario(cpfUsuario); 

        model.addAttribute("denuncias", denuncias);
        return "visualizar_denuncia_usuario";
    }

    @GetMapping("/{id}")
    public String visualizarDenuncia(@PathVariable UUID id, Model model) {
        // Lógica para obter e exibir detalhes da denúncia específica
        DenunciaModel denuncia = repo.findById(id).orElse(null);
        if (denuncia != null) {
            model.addAttribute("denuncia", denuncia);
            return "detalhes_denuncia_usuario";
        } else {
            // Tratar denúncia não encontrada
            return "redirect:/visualizarDenunciaUsuario";
        }
    }

    @GetMapping("/criarDenuncia")
    public String redirecionarParaCriarDenuncia() {
        return "criar_denuncia";
    }
}
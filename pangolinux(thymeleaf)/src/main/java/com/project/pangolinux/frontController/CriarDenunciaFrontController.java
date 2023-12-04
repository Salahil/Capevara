package com.project.pangolinux.frontController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.repositorio.DenunciaRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/denunciaUsuario")
public class CriarDenunciaFrontController {

    @Autowired
    private DenunciaRepository repo;

    @PostMapping
    public String criarDenuncia(@ModelAttribute("denuncia") DenunciaModel denuncia, HttpSession session) {
        // Lógica para salvar a denúncia no banco de dados
        // Certifique-se de preencher automaticamente os campos como data da denúncia, número do protocolo, etc.
        // Utilize a sessão para obter o CPF do usuário logado, se aplicável
        String cpfUsuarioLogado = (String) session.getAttribute("cpfUsuarioLogado");
        denuncia.setCpf(cpfUsuarioLogado);
        repo.save(denuncia);

        return "redirect:/visualizarDenunciaUsuario";
    }
}

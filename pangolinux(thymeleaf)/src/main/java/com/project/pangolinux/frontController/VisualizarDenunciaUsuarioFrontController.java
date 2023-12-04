package com.project.pangolinux.frontController;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.DenunciaRepository;
import com.project.pangolinux.repositorio.UsuarioRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/denunciaUsuario")
public class VisualizarDenunciaUsuarioFrontController {

    @Autowired
    private DenunciaRepository denRepo;

    @Autowired
    private UsuarioRepository usuRepo; // Para obter informações do usuário logado

    @GetMapping
    public String exibirFormularioCriarDenuncia(Model model) {
        model.addAttribute("denuncia", new DenunciaModel());
        return "criarDenuncia";
    }

    @PostMapping
    public String criarDenuncia(@ModelAttribute("denuncia") DenunciaModel denuncia, HttpSession session) {
        // Lógica para preencher informações adicionais da denúncia
        // Por exemplo, data da denúncia, número do protocolo (pode ser gerado automaticamente), etc.

        // Preencher automaticamente alguns campos
        denuncia.iserirDataDenuncia(new Date()); // Data atual
        denuncia.setNumeroProtocolo(gerarNumeroProtocolo()); // Lógica para gerar o número do protocolo

        // Obter informações do usuário logado (pode depender da sua configuração de login)
        // Supondo que você tenha um atributo de sessão chamado "cpfUsuarioLogado" com o CPF do usuário
        String cpfUsuarioLogado = (String) session.getAttribute("cpfUsuarioLogado");
        if (cpfUsuarioLogado != null) {
            UsuarioModel usuarioLogado = usuRepo.findByCpf(cpfUsuarioLogado);
            denuncia.setUsuario(usuarioLogado);
        } else {
            // Tratamento para denúncia anônima
            denuncia.setCpf(null);
        }

        // Outras lógicas de preenchimento de informações da denúncia

        // Salvar a denúncia no banco de dados
        denRepo.save(denuncia);

        return "redirect:/visualizarDenunciaUsuario"; // Redirecionar para a página após a criação
    }

    // Lógica para gerar um número de protocolo (exemplo simples, ajuste conforme necessário)
    private String gerarNumeroProtocolo() {
        return UUID.randomUUID().toString();
    }
}

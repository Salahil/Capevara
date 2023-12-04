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
import com.project.pangolinux.repositorio.DenunciaRepository;

@Controller
@RequestMapping("/denunciaAnalista")
public class VisualizarDenunciaAnalistaFrontController {

    @Autowired
    private DenunciaRepository repo;

    @GetMapping
    public String listarDenunciasAnalista(Model model) {
        // Lógica para recuperar e exibir todas as denúncias (incluindo anônimas) para o analista
        List<DenunciaModel> denuncias = repo.findAll();

        model.addAttribute("denuncias", denuncias);
        return "listarDenunciaAnalista";
    }

    @GetMapping("/{id}")
    public String editarDenunciaAnalista(@PathVariable UUID id, Model model) {
        // Lógica para recuperar e exibir detalhes específicos da denúncia para edição
        DenunciaModel denuncia = repo.findById(id).orElse(null);

        if (denuncia != null) {
            model.addAttribute("denuncia", denuncia);
            return "editarDenunciaAnalista";
        } else {
            // Lógica para lidar com denúncia não encontrada
            return "redirect:/listarDenunciaAnalista";
        }
    }
}

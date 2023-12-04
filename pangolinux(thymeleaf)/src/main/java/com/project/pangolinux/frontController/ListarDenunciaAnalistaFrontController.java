package com.project.pangolinux.frontController;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.repositorio.DenunciaRepository;

@Controller
@RequestMapping("/listaDenunciaAnalista")
public class ListarDenunciaAnalistaFrontController {

    @Autowired
    private DenunciaRepository repo;

    @GetMapping
    public String listarDenunciaAnalista(Model model) {
        List<DenunciaModel> denuncias = repo.findAll();
        model.addAttribute("denuncias", denuncias);
        return "listar_denuncia_analista";
    }

    @GetMapping("/{id}")
    public String visualizarDenunciaAnalista(@PathVariable UUID id, Model model) {
        DenunciaModel denuncia = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Denúncia não encontrada: " + id));
        model.addAttribute("denuncia", denuncia);
        return "visualizar_denuncia_analista";
    }

    @PostMapping("/{id}/editar")
    public String editarDenunciaAnalista(@PathVariable Long id, @ModelAttribute("denuncia") DenunciaModel denuncia) {
        // Lógica para editar denúncia (categoria, situação, descrição do analista, parecer técnico)
        return "redirect:/listarDenunciaAnalista";
    }
}
package com.project.pangolinux.frontController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.repositorio.DenunciaRepository;
import com.project.pangolinux.repositorio.EnderecoRepository;

@Controller
public class ListarDenunciaAnalistaFrontController {
	
    @Autowired
    private DenunciaRepository denunciaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("/listaDenunciaAnalista")
    public String listaDenunciaAnalista(Model model) {
        List<DenunciaModel> denuncias = denunciaRepository.findAll();
        model.addAttribute("denuncias", denuncias);
        return "listaDenunciaAnalista"; 
    }
    
    @PostMapping("/listaDenunciaAnalista")
    public String listarDenunciasAnalista(List<DenunciaModel> denuncias, Model model) {
    	denuncias = denunciaRepository.findAll();
    	model.addAllAttributes(denuncias);
    	return "listaDenunciaAnalista";
    }
}


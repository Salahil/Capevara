package com.project.pangolinux.frontController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.pangolinux.modelos.DenunciaModel;

@Controller
public class CriarDenunciaFrontController {

    @GetMapping("/denunciaUsuario")
    public String mostrarFormularioDenuncia(Model model) {
        
        model.addAttribute("denuncia", new DenunciaModel());
        return "denunciaUsuario"; 
    }

    @PostMapping("/salvarDenuncia")
    public String salvarDenuncia(DenunciaModel denuncia) {
        System.out.println("Denuncia salva: " + denuncia.toString());
        return "redirect:/denunciaSalva"; 
    }
}

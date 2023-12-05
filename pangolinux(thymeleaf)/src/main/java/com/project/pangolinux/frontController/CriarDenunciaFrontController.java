package com.project.pangolinux.frontController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.DenunciaRepository;
=======

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.repositorio.DenunciaRepository;
import com.project.pangolinux.repositorio.EnderecoRepository;
>>>>>>> julio2.0
import com.project.pangolinux.repositorio.UsuarioRepository;

@Controller
public class CriarDenunciaFrontController {
	
	@Autowired
<<<<<<< HEAD
    private DenunciaRepository denunciaRepository;
	

    @GetMapping({"/denunciaUsuario"})
    public String telaDenunciaUsuario(Model model) {
        model.addAttribute("denuncia", new DenunciaModel());
        return "denuncia";
    }

    @PostMapping("/cadastrarDenuncia")
    public String cadastrarDenuncia(@ModelAttribute DenunciaModel den, Model model) {
       

        // Lógica para salvar no banco de dados
        denunciaRepository.save(den);

        // Redireciona para a página de sucesso ou outra ação necessária
        return "redirect:/login";
    }
	/*@GetMapping({"/user", "/"})
    public String listUser(Model model) {
        model.addAttribute("user", user.listAllUsers());
        return "usuario";
    }
    @GetMapping("/user/new")
    public String displayPersonRegistrationForm(Model model) {
        UsuarioModel person = new UsuarioModel();
        model.addAttribute("person", person);
        return "create_usuario";
    }

    @PostMapping("/user")
    public String savePerson(@ModelAttribute("person") UsuarioModel person) {
    	user.savePerson(person);
        return "redirect:/usuario";
    }

    @GetMapping("/people/edit/{id}")
    public String displayEditForm(@PathVariable UUID id, Model model) {
        model.addAttribute("person", user.getPersonById(id));
        return "edit_usuario";
    }

    @PostMapping("/people/{id}")
    public String updatePerson(@PathVariable UUID id, @ModelAttribute("person") UsuarioModel person, Model model) {
    	UsuarioModel existsPerson = user.getPersonById(id);
        existsPerson.setCPF(person.getCPF());
        existsPerson.setSenha(person.getSenha());
        existsPerson.setTipoUsario(person.getTipoUsuario());
        

        user.updatePerson(existsPerson);

        return "redirect:/people";
    }

    @GetMapping("/people/{id}")
    public String deletePerson(@PathVariable UUID id) {
    	user.deletePerson(id);
        return "redirect:/people";
    }*/
}
=======
	DenunciaRepository repoDen;
	
	@Autowired
	UsuarioRepository repoUser;
	
	@Autowired
	EnderecoRepository repoEnd;
	
	@GetMapping("/denunciaUsuario")
	public String telaCriarDenuncia(Model model) {
		model.addAttribute("denuncia", new DenunciaModel());
		return "denunciausuario";
	}
	
	
}
>>>>>>> julio2.0

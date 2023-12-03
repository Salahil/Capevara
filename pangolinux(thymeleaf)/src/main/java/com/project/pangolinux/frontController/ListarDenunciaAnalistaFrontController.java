package com.project.pangolinux.frontController;

public class ListarDenunciaAnalistaFrontController {
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

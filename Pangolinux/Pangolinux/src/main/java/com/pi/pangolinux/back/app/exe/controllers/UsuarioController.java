package com.pi.pangolinux.back.app.exe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pi.pangolinux.back.app.exe.models.UsuarioModel;
import com.pi.pangolinux.back.app.exe.services.UsuarioService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Object> salvarUsuario(@RequestBody UsuarioModel usuario) {
        // Adicione validações, se necessário
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> getTodosUsuarios() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUmUsuario(@PathVariable(value = "id") UUID id) {
        Optional<UsuarioModel> usuarioOptional = usuarioService.findById(id);
        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioOptional.get());
        }
    }
}

package com.pi.pangolinux.back.app.exe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pi.pangolinux.back.app.exe.models.EnderecoModel;
import com.pi.pangolinux.back.app.exe.services.EnderecoService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<Object> salvarEndereco(@RequestBody EnderecoModel endereco) {
        // Adicione validações, se necessário
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.save(endereco));
    }

    @GetMapping
    public ResponseEntity<List<EnderecoModel>> getTodosEnderecos() {
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUmEndereco(@PathVariable(value = "id") UUID id) {
        Optional<EnderecoModel> enderecoOptional = enderecoService.findById(id);
        if (!enderecoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereco não encontrado");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(enderecoOptional.get());
        }
    }
}

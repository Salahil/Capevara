package com.pi.pangolinux.back.app.exe.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pi.pangolinux.back.app.exe.DTO.PangolinuxDDTO;
import com.pi.pangolinux.back.app.exe.models.DenunciaAnaliModel;
import com.pi.pangolinux.back.app.exe.services.DenunciaAnaliService;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/denunciaanali")
public class DenunciaAnaliController {
    @Autowired
    private DenunciaAnaliService denunciaAnaliService;

    @PostMapping
    public ResponseEntity<Object> salvarDenunciaAnali(@RequestBody @Valid PangolinuxDDTO pangoDTO) {
        DenunciaAnaliModel denunciaAnali = new DenunciaAnaliModel();
        BeanUtils.copyProperties(pangoDTO, denunciaAnali);
        // Adicione lógica específica, se necessário
        return ResponseEntity.status(HttpStatus.CREATED).body(denunciaAnaliService.save(denunciaAnali));
    }

    @GetMapping
    public ResponseEntity<List<DenunciaAnaliModel>> getTodasDenunciasAnali() {
        return ResponseEntity.status(HttpStatus.OK).body(denunciaAnaliService.getAll());
    }

    @GetMapping("/{protocolo}")
    public ResponseEntity<Object> getUmaDenunciaAnali(@PathVariable(value = "protocolo") String protocolo) {
        Optional<DenunciaAnaliModel> denunciaAnaliOptional = denunciaAnaliService.findById(protocolo);
        if (!denunciaAnaliOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("DenunciaAnali não encontrada");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(denunciaAnaliOptional.get());
        }
    }
}

package com.pi.pangolinux.back.app.exe.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.pangolinux.back.app.exe.DTO.PangolinuxDDTO;
import com.pi.pangolinux.back.app.exe.models.DenunciaDenModel;
import com.pi.pangolinux.back.app.exe.repository.DenunciaDenRepository;
import com.pi.pangolinux.back.app.exe.services.DenunciaDenService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/denunciaden")
public class DenunciaDenController {
	
	final DenunciaDenService denunciaDenService;
	public DenunciaDenController(DenunciaDenService pangolinuxServ) {
		this.denunciaDenService = pangolinuxServ;
	}
	
	@Controller
	public class FrontController {
	    @GetMapping("/Cadastro")
	    public String frontCadastro() {
	        return "Cadastro";
	    }
	}

	@PostMapping
	public ResponseEntity<Object> salvarDenuncia(@RequestBody @Valid PangolinuxDDTO pangoDTO){
	//colocar verificações aqui caso seja necessário validar alguma coisa antes de salvar uma denuncia.
		DenunciaDenModel denuncia = new DenunciaDenModel();
		BeanUtils.copyProperties(pangoDTO, denuncia);
		denuncia.setDataDen(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(denunciaDenService.save(denuncia));
	}
	
	@GetMapping
	public ResponseEntity<List<DenunciaDenModel>> getTODAS_Denuncias(){
		return ResponseEntity.status(HttpStatus.OK).body(denunciaDenService.getALL());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUMA_Denuncia(@PathVariable(value = "protocolo") String protocolo){
		Optional<DenunciaDenModel> denunciaOptional = denunciaDenService.findById(protocolo);
		if(!denunciaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Denuncia não encontrada");
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(denunciaOptional.get());
		}
	}
}
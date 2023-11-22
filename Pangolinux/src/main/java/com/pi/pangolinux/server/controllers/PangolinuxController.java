package com.pi.pangolinux.server.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.pangolinux.back.DDTOs.PangolinuxDDTO;
import com.pi.pangolinux.back.objects.DenunciaDenunciante;
import com.pi.pangolinux.server.services.PangolinuxService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pangolinux-db")
public class PangolinuxController {
	
	final PangolinuxService pangolinuxServ;
	public PangolinuxController(PangolinuxService pangolinuxServ) {
		this.pangolinuxServ = pangolinuxServ;
	}
	/*
	@PostMapping
	public ResponseEntity<Object> salvarDenuncia(@RequestBody @Valid PangolinuxDDTO pangoDTO){
	//colocar verificações aqui caso seja necessário validar alguma coisa antes de salvar uma denuncia.
		DenunciaDenunciante denuncia = new DenunciaDenunciante();
		BeanUtils.copyProperties(pangoDTO, denuncia);
		denuncia.setDataDen(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(PangolinuxService.save(DenunciaDenunciante));
	}
	*/
	/*
	@GetMapping
	public ResponseEntity<List<DenunciaDenunciante>> getTODAS_Denuncias(){
		return ResponseEntity.status(HttpStatus.OK).body(pangolinuxServ.getALL);
	}
	*/
	/*
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUMA_Denuncia(@PathVariable(value = "protocolo") UUID protocolo){
		Optional<DenunciaDenunciante> denunciaOptional = pangolinuxServ.findById(protocolo);
		if(!denunciaOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Denuncia não encontrada");
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(denunciaOptional.get());
		}
	}
	*/
}
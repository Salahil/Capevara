package com.pi.pangolinux.back.app;

import com.pi.pangolinux.server.controllers.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PangolinuxApplication {

	FrontController contrl = new FrontController();
	@GetMapping
	public String index() {
		//return contrl.frontCadastro();
		return "olá, trouxão";
	}
	
	public static void main(String[] args) {SpringApplication.run(PangolinuxApplication.class, args);}

}

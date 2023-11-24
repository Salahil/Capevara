package com.pi.pangolinux.back.actorsModels;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO_MODEL")
public class UsuarioModel {
	// atributos:
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_usuario;
	@Column(name = "CPF", unique = true)
	private int CPF = 0;
	@Column(name = "SENHA")
	private String senha = "";
	@Column(name = "TIPO_USUARIO", nullable = false)
	private boolean tipoUsario = false;
	
	
	
	private boolean anonimato = false;
	
	// gets:
	
	public int getCPF() {
		return CPF;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public boolean getTipoUsuario() {
		return tipoUsario;
	}
	
	public boolean getAnonimato() {
		return anonimato;
	}
	
	// sets:
	
	public void setCPF(int cpf) {
		this.CPF = cpf;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void alterarUserType() {
		if (this.tipoUsario) {// se for verdadeiro, ou seja se ele for um analista,
			this.tipoUsario = false;// passa a ser falso, ele volta a ser só usuario.
		} else if (!this.tipoUsario) {// se já era false,
			this.tipoUsario = true;// ele passa a ser verdadeiro.
		}
	}
	
	public void alterarAnonimato() {
		if (this.anonimato) {// se for verdadeiro, ele estiver em anonimato,
			this.anonimato = false;// ele passa a estar false, ele deixa o anonimo.
		} else if (!this.anonimato) {// se ele estiver em false (o que é bem mais provável),
			this.anonimato = true;// ele passa pro verdadeiro, e entra em modo anonimo.
		}
	}
}

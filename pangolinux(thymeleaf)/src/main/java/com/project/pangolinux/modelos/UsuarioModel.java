package com.project.pangolinux.modelos;

import java.util.UUID;

import com.project.pangolinux.Crypt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario_Model")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_usuario;
	@Column(name = "CPF", unique = true)
	private String CPF;
	@Column(name = "SENHA")
	private String senha;
	@Column(name = "TIPO_USUARIO", nullable = false)
	private boolean tipoUsario = false;
	private boolean anonimato = false;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getSenha() {
		return senha = Crypt.descriptografar(senha, Crypt.chave);
	}
	public boolean getTipoUsuario() {
		return tipoUsario;
	}
	public boolean getAnonimato() {
		return anonimato;
	}
	public void setSenha(String senha) {
		this.senha = Crypt.criptografar(senha, Crypt.chave);
	}
	public boolean isTipoUsario() {
		return tipoUsario;
	}
	public void setTipoUsario(boolean tipoUsario) {
		this.tipoUsario = tipoUsario;
	}
	@Override
	public String toString() {
		return "UsuarioModel [CPF=" + CPF + ", senha=" + senha + ", tipoUsario=" + tipoUsario + ", anonimato=" + anonimato + "]";
	}
}
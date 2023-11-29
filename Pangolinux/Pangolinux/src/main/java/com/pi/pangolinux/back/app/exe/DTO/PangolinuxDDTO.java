package com.pi.pangolinux.back.app.exe.DTO;

import java.util.Date;

import com.pi.pangolinux.back.Enums.CategoriaDenuncia;
import com.pi.pangolinux.back.app.exe.models.EnderecoModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PangolinuxDDTO {
	
	@NotBlank
	@Size(max = 11)
	private int CPF = 0;
	@NotBlank
	private EnderecoModel endereco = new EnderecoModel();
	@NotBlank
	private Date dataOcorrencia;
	@NotBlank
	private CategoriaDenuncia categoria;
	@NotBlank
	private String autorCrime = "";
	@NotBlank
	private String descricaoDenunciante = "";
	
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public EnderecoModel getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoModel endereco) {
		this.endereco = endereco;
	}
	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public CategoriaDenuncia getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaDenuncia categoria) {
		this.categoria = categoria;
	}
	public String getAutorCrime() {
		return autorCrime;
	}
	public void setAutorCrime(String autorCrime) {
		this.autorCrime = autorCrime;
	}
	public String getDescricaoDenunciante() {
		return descricaoDenunciante;
	}
	public void setDescricaoDenunciante(String descricaoDenunciante) {
		this.descricaoDenunciante = descricaoDenunciante;
	}

}

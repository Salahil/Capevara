package com.pi.pangolinux.back.DDTOs;

import java.util.Date;

import com.pi.pangolinux.back.Enums.CategoriaDenuncia;
import com.pi.pangolinux.back.objects.Endereco;

public class PangolinuxDDTO {
	
	//@NotBlank
	//@Size(max = 11)
	private int CPF = 0;
	//@NotBlank
	private Endereco endereco = new Endereco();
	//@NotBlank
	private Date dataOcorrencia;
	//@NotBlank
	private CategoriaDenuncia categoria;
	//@NotBlank
	private String autorCrime = "";
	//@NotBlank
	private String descricaoDenunciante = "";
	
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
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

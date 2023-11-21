package com.pi.pangolinux.back.objects;

import java.util.Date;

import com.pi.pangolinux.back.Enums.CategoriaDenuncia;

public class Denuncia {
	
	// atributos:
	
	private String protocolo = "";
	private int CPF = 0;
	private Endereco endereco = new Endereco();
	private Date dataOcorrencia;
	private Date dataDenuncia;
	private CategoriaDenuncia categoria;
	
	public String getProto() {
		return protocolo;
	}
	public void setProto(String protocolo) {
		this.protocolo = protocolo;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Date getDataOc() {
		return dataOcorrencia;
	}
	public Date getDataDen() {
		return dataDenuncia;
	}
	public void setDataDen(Date newData) {
		this.dataDenuncia = newData;
	}
	public void setDataOc(Date newData) {
		this.dataOcorrencia = newData; 
	}
	public CategoriaDenuncia getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaDenuncia categoria) {
		this.categoria = categoria;
	}
}
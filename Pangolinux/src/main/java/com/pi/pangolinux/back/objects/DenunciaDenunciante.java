package com.pi.pangolinux.back.objects;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

import com.pi.pangolinux.back.Enums.CategoriaDenuncia;

//@Entity
//@Table
public class DenunciaDenunciante {
	
	// atributos:
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID protocolo;
	//@Collum(nullable = false, unique = true, length 11)
	private int CPF = 0;
	//@Collum(nullable = false, unique = true)
	private Endereco endereco = new Endereco();
	//@Collum(nullable = false)
	private Date dataOcorrencia;
	//@Collum(nullable = false)
	private LocalDateTime dataDenuncia;
	//@Collum(nullable = false)
	private CategoriaDenuncia categoria;
	//@Collum(nullable = true)
	private String autorCrime = "";
	//@Collum(nullable = false)
	private String descricaoDenunciante = "";
	
	
	public UUID getProto() {
		return protocolo;
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
	public LocalDateTime getDataDen() {
		return dataDenuncia;
	}
	public void setDataDen(LocalDateTime localDateTime) {
		this.dataDenuncia = localDateTime;
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
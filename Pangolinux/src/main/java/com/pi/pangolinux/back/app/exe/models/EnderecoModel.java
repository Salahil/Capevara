package com.pi.pangolinux.back.app.exe.models;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Entity
@Table(name = "ENDERECO")
public class EnderecoModel {

	// atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_Endereco;
	
	@Column(name = "LOGRADOURO", nullable = false)
	private String logradouro;
	
	@Column(name = "NUMERO", nullable = false)
	private String numero;
	
	@Column(name = "BAIRRO", nullable = false)
	private String bairro;
	
	@Column(name = "REFERENCIA", nullable = true)
	private String referencia = "";
	
	@Column(name = "LATITUDE", nullable = false)
	private String latitude = "";
	
	@Column(name = "LONGITUDE", nullable = false)
	private String longitude = "";
	
	@Column(name = "MUNICIPIO", nullable = false)
	private String municipio = "";
	
	@Column(name = "COMPLEMENTO", nullable = true)
	private String complemento = "";
	
	@Column(name = "CEP", nullable = false)
	private int CEP = 0;
	
	// Constructor:
	
	public EnderecoModel() {
		
	}
	
	public EnderecoModel(String Log, String Num, String Comp, String Bairro, String Ref, String Lati, String Long, String Muni, int CEP) {
		this.CEP = CEP;
		this.bairro = Bairro;
		this.latitude = Lati;
		this.logradouro = Log;
		this.longitude = Long;
		this.municipio = Muni;
		this.numero = Num;
		this.referencia = Ref;
		this.complemento = Comp;
	}
	
	public void atualizarEndereco(String Log, String Num, String Comp, String Bairro, String Ref, String Lati, String Long, String Muni, int CEP) {
		this.CEP = CEP;
		this.bairro = Bairro;
		this.latitude = Lati;
		this.logradouro = Log;
		this.longitude = Long;
		this.municipio = Muni;
		this.numero = Num;
		this.complemento = Comp;
		this.referencia = Ref;
	}
	
	// gets:
	
	public String getMuni() {
		return municipio;
	}
	
	public String getComp() {
		return complemento;
	}
	
	public String getLog() { 
		return logradouro;
	}
	
	public String getNum() { 
		return numero;
	}
	
	public String getBairro() { 
		return bairro;
	}
	
	public String getRef() { 
		return referencia;
	}
	
	public String getLati() { 
		return latitude;
	}
	
	public String getLong() { 
		return longitude;
	}
	
	public int getCEP() { 
		return CEP;
	}
	
	// sets:
	
	public void setLog(String newLog) { 
		this.logradouro = newLog;
	}
	
	public void setNum(String newNum) { 
		this.numero = newNum;
	}
	
	public void setBairro(String newBairro) { 
		this.bairro = newBairro;
	}
	
	public void setRef(String pontoReferencia) {
		this.referencia = pontoReferencia;
	}
	
	public void setLati(String newLati) { 
		this.latitude = newLati;
	}
	
	public void setLong(String newLong) { 
		this.longitude = newLong;
	}
	
	public void setMuni(String newMuni) { 
		this.municipio = newMuni;
	}
	
	public void setCEP(int newCEP) { 
		this.CEP = newCEP;
	}
	
	public void setComp(String newComp) {
		this.complemento = newComp;
	}

	public UUID getID() {
		return id_Endereco;
	}
}
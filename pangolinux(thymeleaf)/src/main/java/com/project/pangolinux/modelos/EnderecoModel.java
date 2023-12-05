package com.project.pangolinux.modelos;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Endereco_Model")
public class EnderecoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_Endereco;
	@Column(name = "Logradouro")
	private String logradouro;
	@Column(name = "numero")
	private String numero;
	@Column(name = "bairro")
	private String bairro;
	@Column(name = "referencia")
	private String referencia;
	@Column(name = "latitude")
	private int latitude;
	@Column(name = "longitude")
	private int longitude;
	@Column(name = "municipio")
	private String municipio;
	@Column(name = "complemento")
	private String complemento;
	@Column(name = "CEP")
	private String cep;
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "EnderecoModel [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", referencia="
				+ referencia + ", latitude=" + latitude + ", longitude=" + longitude + ", municipio=" + municipio
				+ ", complemento=" + complemento + ", cep=" + cep + "]";
	} 
	
	
}

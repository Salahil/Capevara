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
	private long latitude;
	@Column(name = "longitude")
	private long longitude;
	@Column(name = "municipio")
	private String municipio;
	@Column(name = "complemento")
	private String complemento;
	@Column(name = "CEP")
	private String cep; 
	
	
}

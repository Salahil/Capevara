package com.project.pangolinux.modelos;

import java.time.LocalDateTime;
import java.util.UUID;

import com.project.pangolinux.enums.Categoria;
import com.project.pangolinux.enums.Situacao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Denuncia_Model")
public class DenunciaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public UUID id_Denuncia;
	@Column(name = "Protocolo")
	public String protocolo;
	@Column(name = "CPF")
	private String CPF;
	@Column(name = "Enderco")
	private UUID endereco;
	@Column(name = "Data_Ocorrencia")
	private String dataOcorrencia;
	@Column(name = "Data_Denuncia")
	private String dataDenuncia;
	@Column(name = "Categoria")
	private String categoria;
	@Column(name = "Autor_Crime")
	private String autor;
	@Column(name = "Descricao_do_Denunciante")
	private String descricaoDenunciante;
	@Column(name = "Parecer_Tecnico")
	public String parecer;
	@Column(name = "Descricao_Analista")
	private String descricaoAnalista;
	@Column(name = "Situacao_Processo")
	private String situacaoProcesso;

	
	
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public UUID getEndereco() {
		return endereco;
	}
	public void setEndereco(UUID endereco) {
		this.endereco = endereco;
	}
	public String getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(String dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public String getDataDenuncia() {
		return dataDenuncia;
	}
	public void setDataDenuncia(String dataDenuncia) {
		this.dataDenuncia = dataDenuncia;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescricaoDenunciante() {
		return descricaoDenunciante;
	}
	public void setDescricaoDenunciante(String descricaoDenunciante) {
		this.descricaoDenunciante = descricaoDenunciante;
	}
	public String getParecer() {
		return parecer;
	}
	public void setParecer(String parecer) {
		this.parecer = parecer;
	}
	public String getDescricaoAnalista() {
		return descricaoAnalista;
	}
	public void setDescricaoAnalista(String descricaoAnalista) {
		this.descricaoAnalista = descricaoAnalista;
	}
	public String getSituacaoProcesso() {
		return situacaoProcesso;
	}
	public void setSituacaoProcesso(String situacaoProcesso) {
		this.situacaoProcesso = situacaoProcesso;
	}
	public void iserirDataDenuncia(LocalDateTime data) {
		this.dataDenuncia = "" + data;
	}
	public void inserirCategoria(Categoria categoria) {
		this.categoria = "" + categoria;
	}
	public void inserirSituacao(Situacao situacao) {
		this.situacaoProcesso = "" + situacao;
	}
}
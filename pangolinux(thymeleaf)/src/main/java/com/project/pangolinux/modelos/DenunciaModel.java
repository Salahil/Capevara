package com.project.pangolinux.modelos;

import java.time.LocalDateTime;
import java.util.Date;
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

	private UsuarioModel usuario = new UsuarioModel();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public UUID id_Denuncia;
	@Column(name = "Protocolo")
	public String protocolo;
	@Column(name = "CPF")
	private String CPF;
	@Column(name = "Endereco")
	private UUID endereco;
	@Column(name = "Data_Ocorrencia")
	private Date dataOcorrencia;
	@Column(name = "Data_Denuncia")
	private Date dataDenuncia;
	@Column(name = "Categoria")
	private Categoria categoria;
	@Column(name = "Autor_Crime")
	private String autor;
	@Column(name = "Descricao_do_Denunciante")
	private String descricaoDenunciante;
	@Column(name = "Parecer_Tecnico")
	public String parecer;
	@Column(name = "Descricao_Analista")
	private String descricaoAnalista;
	@Column(name = "Situacao_Processo")
	private Situacao situacaoProcesso;

	public void iserirDataDenuncia(Date date) {
		this.dataDenuncia = date;
	}
	public void inserirCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public void inserirSituacao(Situacao situacao) {
		this.situacaoProcesso = situacao;
	}
	public void setCpf(String cpf) {
		this.CPF = cpf;
	}
	public void setNumeroProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public void setUsuario(UsuarioModel usuarioLogado) {
		this.usuario = usuarioLogado;
	}
	public UsuarioModel getUsuario(UsuarioModel user) {
		return usuario;
	}
}
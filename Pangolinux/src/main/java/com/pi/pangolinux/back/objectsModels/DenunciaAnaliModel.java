package com.pi.pangolinux.back.objectsModels;

import com.pi.pangolinux.back.Enums.SituacaoProcesso;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class DenunciaAnaliModel extends com.pi.pangolinux.back.objectsModels.DenunciaDenModel {
	//@Id
	/*
	 * Lembrar que tem que configurar aqui a chave estrangeira da tabela de denuncia do denunciante
	 * a chave é a String protocolo 
	 */
	@Column(name = "DESCRICAO_ANALISTA",nullable = false)
	private String descricaoAnalista = "";
	//@Column(name = PARECER_TECNICO, nullable = false)
	/*
	 *  
	 *  Lembrar que aqui tem que ter o PARECER_TECNICO que ninguém sabe que formato vai ter
	 * */
	@Column(name = "SITUACAO_PROCESSO",nullable = false)
	private SituacaoProcesso situacao;
	
	public String getDescricaoAnalista() {
		return descricaoAnalista;
	}
	public void setDescricaoAnalista(String descricaoAnalista) {
		this.descricaoAnalista = descricaoAnalista;
	}
	public SituacaoProcesso getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoProcesso situacao) {
		this.situacao = situacao;
	}
}

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
	 */
	@Column(name = "DESCRICAO_ANALISTA",nullable = false)
	private String descricaoAnalista = "";
	//@Collum(nullable = false)
	/*
	 *  Lembrar que aqui tem que ter o troço que ninguém sabe o q é
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

package com.pi.pangolinux.back.objects;

import com.pi.pangolinux.back.Enums.SituacaoProcesso;

//@Entity
//@Table
public class DenunciaAnalista extends com.pi.pangolinux.back.objects.DenunciaDenunciante {
	//@Id
	/*
	 * Lembrar que tem que configurar aqui a chave estrangeira da tabela de denuncia do denunciante 
	 */
	//@Collum(nullable = false)
	private String descricaoAnalista = "";
	//@Collum(nullable = false)
	/*
	 *  Lembrar que aqui tem que ter o troço que ninguém sabe o q é
	 * */
	//@Collum(nullable = false)
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

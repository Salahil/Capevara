package com.pi.pangolinux.back.app.exe.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.pi.pangolinux.back.Enums.CategoriaDenuncia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class DenunciaDenModel {
	
    private static Set<String> protocolosExistentes = new HashSet<>();
	
    private String gerarProtocoloUnico() {
        String novoProtocolo;
        do {
            novoProtocolo = gerarProtocolo();
        } while (!protocolosExistentes.add(novoProtocolo));
        return novoProtocolo;
    }
    
    private String gerarProtocolo() {
        // Gera 4 números aleatórios
        Random random = new Random();
        StringBuilder numeros = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            numeros.append(random.nextInt(10)); // Gera dígitos de 0 a 9
        }

        // Obtém o ano atual
        int anoAtual = LocalDate.now().getYear();

        // Combina os números e o ano para formar o protocolo
        return numeros.toString() + "/" + anoAtual;
    }

    private EnderecoModel coiso = new EnderecoModel();
    
    private CategoriaDenuncia categoria;
	
	@Id
    private String protocolo = gerarProtocoloUnico();
	
	@Column(name = "CPF", nullable = false, unique = true, length =  11)
	private int CPF = 0;
	
	@Column(name = "ENDERECO", nullable = false, unique = true)
	private UUID endereco = coiso.getID();
	
	@Column(name = "DATA_OCORRENCIA", nullable = false)
	private Date dataOcorrencia;
	
	@Column(name = "DATA_DENUNCIA",nullable = false)
	private LocalDateTime dataDenuncia;
	
	@Column(name = "CATEGORIA",nullable = false)
	private String treco = "" + categoria;
	
	@Column(name = "AUTOR_CRIME",nullable = true)
	private String autorCrime;
	
	@Column(name = "DESCRICAO_DENUNCIANTE", nullable = false)
	private String descricaoDenunciante;
	
	
	public String getProto() {
		return protocolo;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	public UUID getEndereco() {
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
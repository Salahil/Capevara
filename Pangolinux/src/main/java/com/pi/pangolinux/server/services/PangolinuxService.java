package com.pi.pangolinux.server.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pi.pangolinux.back.objects.DenunciaDenunciante;
import com.pi.pangolinux.server.repos.IPangolinuxRepository;

@Service
public class PangolinuxService {
	
	final IPangolinuxRepository pangolinuxRepos;
	public PangolinuxService(IPangolinuxRepository pangolinuxRepo) {
		this.pangolinuxRepos = pangolinuxRepo;
	}
	
	/*
	@Trasactional
	public DenunciaDenunciante save(DenunciaDenunciante denuncia) {
		return pangolinuxRepos.save(DenunciaDenunciante);
	}
	*/
	
	/*
	public List<DenunciaDenunciante> getALL(){
		return pangolinuxRepos.findAll();
	}
	*/
	
	// caso haja validações a serem feitas, faremos aqui.
}

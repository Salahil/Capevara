package com.pi.pangolinux.server.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pi.pangolinux.back.objectsModels.DenunciaDenModel;
import com.pi.pangolinux.server.repos.DenunciaDenRepository;

@Service
public class DenunciaDenService {
	
	private final DenunciaDenRepository denunciaDenRepos;
	
	
	
	@Autowired
    public DenunciaDenService(DenunciaDenRepository denunciaDenRepos) {
        this.denunciaDenRepos = denunciaDenRepos;
    }

    public Optional<DenunciaDenModel> findById(UUID protocolo) {
        return denunciaDenRepos.findById(protocolo);
    }
	
	@Transactional
	public DenunciaDenModel save(DenunciaDenModel denuncia) {
		return denunciaDenRepos.save(denuncia);
	}
	
	
	public List<DenunciaDenModel> getALL(){
		return denunciaDenRepos.findAll();
	}

	
	// caso haja validações a serem feitas, faremos aqui.
}

package com.pi.pangolinux.back.app.exe.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pi.pangolinux.back.app.exe.models.DenunciaDenModel;
import com.pi.pangolinux.back.app.exe.repository.DenunciaDenRepository;

@Service
public class DenunciaDenService {
	
	private final DenunciaDenRepository denunciaDenRepos;
	
	
	
	@Autowired
    public DenunciaDenService(DenunciaDenRepository denunciaDenRepos) {
        this.denunciaDenRepos = denunciaDenRepos;
    }

    public Optional<DenunciaDenModel> findById(String protocolo) {
        return denunciaDenRepos.findByProtocolo(protocolo);
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

package com.project.pangolinux.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pangolinux.repositorio.DenunciaRepository;

@Service
public class DenunciaService {


	@Autowired
	private DenunciaRepository den;
	
}

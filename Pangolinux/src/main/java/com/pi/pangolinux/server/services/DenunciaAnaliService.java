package com.pi.pangolinux.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.pangolinux.back.objectsModels.DenunciaAnaliModel;
import com.pi.pangolinux.server.repos.DenunciaAnaliRepository;

@Service
public class DenunciaAnaliService {
    @Autowired
    private DenunciaAnaliRepository denunciaAnaliRepository;

    public DenunciaAnaliModel save(DenunciaAnaliModel denunciaAnali) {
        // Adicione lógica de validação ou manipulação, se necessário
        return denunciaAnaliRepository.save(denunciaAnali);
    }

    public List<DenunciaAnaliModel> getAll() {
        return denunciaAnaliRepository.findAll();
    }

    public Optional<DenunciaAnaliModel> findById(String protocolo) {
        return denunciaAnaliRepository.findById(protocolo);
    }
}

package com.pi.pangolinux.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.pangolinux.back.objectsModels.EnderecoModel;
import com.pi.pangolinux.server.repos.EnderecoRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoModel save(EnderecoModel endereco) {
        // Adicione lógica de validação ou manipulação, se necessário
        return enderecoRepository.save(endereco);
    }

    public List<EnderecoModel> getAll() {
        return enderecoRepository.findAll();
    }

    public Optional<EnderecoModel> findById(UUID id) {
        return enderecoRepository.findById(id);
    }
}
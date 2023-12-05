package com.project.pangolinux.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pangolinux.modelos.DenunciaModel;
import com.project.pangolinux.modelos.UsuarioModel;
import com.project.pangolinux.repositorio.DenunciaRepository;
import com.project.pangolinux.repositorio.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DenunciaService {

    @Autowired
    DenunciaRepository repoDen;

    @Autowired
    UsuarioRepository repoUser;

    public void salvarDenuncia(DenunciaModel denuncia) {
        // Aqui você pode adicionar lógica de negócios antes de salvar, se necessário
        repoDen.save(denuncia);
    }

    public List<DenunciaModel> findAllByCPF(String Cpf) {
        UsuarioModel usuario = repoUser.findByCPF(Cpf).get(0);
        List<DenunciaModel> lista = repoDen.findAll();
        List<DenunciaModel> coiso = new ArrayList<>();
        for (DenunciaModel denuncia : lista) {
            if (denuncia.getCPF().equals(Cpf)) {
                coiso.add(denuncia);
            }
        }
        return coiso;
    }
}

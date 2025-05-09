package com.example.AulaTeste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AulaTeste.errors.FormularioJaExiste;
import com.example.AulaTeste.model.FormularioModel;
import com.example.AulaTeste.repository.IFormularioRepository;

@Service
public class FormularioService {
    @Autowired
    private IFormularioRepository FormularioRepository;

    public FormularioModel criarFormulario(FormularioModel FormularioModel) {
        var FormularioExistente = FormularioRepository.findBynome_de_empresa(FormularioModel.getNome_de_empresa());
        if (FormularioExistente != null) {
            throw new FormularioJaExiste();
        }

        return FormularioRepository.save(FormularioModel);
    }

    public List<FormularioModel> listarFormulario() {
        return FormularioRepository.findAll();
    }

    public FormularioModel buscarnome_de_empresa(String nome_de_empresa) {
        return FormularioRepository.findBynome_de_empresa(nome_de_empresa);
    }
}

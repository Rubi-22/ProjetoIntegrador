package com.example.AulaTeste.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AulaTeste.model.FormularioModel;

public interface IFormularioRepository extends JpaRepository<FormularioModel, UUID> {
  FormularioModel findBynome_de_empresa(String nome_de_empresa);
}

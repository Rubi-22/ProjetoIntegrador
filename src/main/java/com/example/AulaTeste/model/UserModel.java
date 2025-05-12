package com.example.AulaTeste.model;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor

public class UserModel {
   
    @Id()
    @GeneratedValue()
    private UUID codigo_usuario;

    @Column(name = "razao_social")
    private String razao_social;

   // @Column(name = "nome_fantasia")
    //private String nome;

    @Column(name = "ramo_de_atividade")
    private String ramo_de_atividade;

    @Column(name = "data_de_fundacao")
    private String data_de_fundacao; 

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "endereco_comercial")
    private String endereco;

    @Column(name = "email")
    private String email;

    @Column(name  = "telefone")
    private String telefone;

    @Column(name  = "responsavel")
    private String responsavel;
 
}

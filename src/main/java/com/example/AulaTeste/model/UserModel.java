package com.example.AulaTeste.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "usuario")
public class UserModel {
   
    @Id
    @GeneratedValue(generator = "UUID")
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
 
    @Column(name  = "senha")
    private String senha;

    public UserModel() {
    }

    public UserModel(String razao_social, String ramo_de_atividade, String data_de_fundacao,
            String cnpj, String endereco, String email, String telefone, String responsavel, String senha) {
        this.razao_social = razao_social;
        this.ramo_de_atividade = ramo_de_atividade;
        this.data_de_fundacao = data_de_fundacao;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.responsavel = responsavel;
        this.senha = senha;
    }
}

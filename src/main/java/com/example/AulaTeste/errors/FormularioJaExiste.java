package com.example.AulaTeste.errors;

public class FormularioJaExiste extends RuntimeException {
  private String mensagem;
  public FormularioJaExiste() {
    this.mensagem = "Formulario já existe";
  }

  public String getMensagem() {
      return mensagem;
  }

  public void setMensagem(String mensagem) {
      this.mensagem = mensagem;
  }
}

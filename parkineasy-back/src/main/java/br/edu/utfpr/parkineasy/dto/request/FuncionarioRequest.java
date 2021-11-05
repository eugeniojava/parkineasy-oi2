package br.edu.utfpr.parkineasy.dto.request;

import javax.validation.constraints.NotBlank;

public class FuncionarioRequest {
    @NotBlank
    String nome;
    @NotBlank
    String email;
    @NotBlank
    String senha;

    public FuncionarioRequest(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}

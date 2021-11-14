package br.edu.utfpr.parkineasy.dto.request;

import javax.validation.constraints.NotBlank;

public class FuncionarioRequest {
    @NotBlank
    private final String email;

    @NotBlank
    private final String senha;

    @NotBlank
    private final String nome;

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

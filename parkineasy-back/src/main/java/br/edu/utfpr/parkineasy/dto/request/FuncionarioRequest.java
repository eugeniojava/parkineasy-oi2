package br.edu.utfpr.parkineasy.dto.request;

import javax.validation.constraints.NotBlank;

public class FuncionarioRequest {
    @NotBlank
    String nome;
    @NotBlank
    String email;
    @NotBlank
    String senha;

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

package br.edu.utfpr.parkineasy.dto.response;

import br.edu.utfpr.parkineasy.model.Funcionario;

public class FuncionarioResponse {
    String nome;
    String email;
    String senha;

    public FuncionarioResponse(Funcionario funcionario) {
        this.nome = funcionario.getNome();
        this.email = funcionario.getEmail();
        this.senha = funcionario.getSenha();
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

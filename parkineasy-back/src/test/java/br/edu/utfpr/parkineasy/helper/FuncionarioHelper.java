package br.edu.utfpr.parkineasy.helper;

import br.edu.utfpr.parkineasy.dto.request.FuncionarioRequest;
import br.edu.utfpr.parkineasy.model.Funcionario;

public class FuncionarioHelper {
    public static Funcionario umFuncionario() {
        return new Funcionario("Bruno","bruno@gmail.com","12345");
    }

    public static FuncionarioRequest umFuncionarioRequestInvalido() {
        return new FuncionarioRequest("Marcos","marcos@gmail.com", "12345");
    }

    public static FuncionarioRequest umFuncionarioRequest() {
        return new FuncionarioRequest("Bruno","bruno@gmail.com", "12345");
    }
}

package br.edu.utfpr.parkineasy.service;

import br.edu.utfpr.parkineasy.dto.request.FuncionarioRequest;
import br.edu.utfpr.parkineasy.dto.response.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse criarFuncionario(FuncionarioRequest funcionarioRequest);
}

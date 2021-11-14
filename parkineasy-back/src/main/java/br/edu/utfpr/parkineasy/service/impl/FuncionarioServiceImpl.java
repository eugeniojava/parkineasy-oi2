package br.edu.utfpr.parkineasy.service.impl;

import br.edu.utfpr.parkineasy.dto.request.FuncionarioRequest;
import br.edu.utfpr.parkineasy.dto.response.FuncionarioResponse;
import br.edu.utfpr.parkineasy.exception.ValidacaoException;
import br.edu.utfpr.parkineasy.model.Funcionario;
import br.edu.utfpr.parkineasy.repository.FuncionarioRepository;
import br.edu.utfpr.parkineasy.service.FuncionarioService;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public FuncionarioResponse criarFuncionario(FuncionarioRequest funcionarioRequest) {
        if (funcionarioRepository.findByEmail(funcionarioRequest.getEmail()).isPresent()) {
            throw new ValidacaoException("Email ja cadastrado");
        }
        Funcionario funcionario = new Funcionario(
            funcionarioRequest.getNome(),
            funcionarioRequest.getEmail(),
            funcionarioRequest.getSenha()
        );
        return new FuncionarioResponse(funcionarioRepository.save(funcionario));
    }
}

package br.edu.utfpr.parkineasy.service.impl;

import br.edu.utfpr.parkineasy.dto.request.FuncionarioRequest;
import br.edu.utfpr.parkineasy.dto.response.FuncionarioResponse;
import br.edu.utfpr.parkineasy.exception.ValidacaoException;
import br.edu.utfpr.parkineasy.model.Funcionario;
import br.edu.utfpr.parkineasy.repository.FuncionarioRepository;
import br.edu.utfpr.parkineasy.service.FuncionarioService;
import org.springframework.stereotype.Service;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public FuncionarioResponse criarUsuario(FuncionarioRequest funcionarioRequest) {
        if (!isEmpty(funcionarioRepository.findTopByEmail(funcionarioRequest.getEmail()))) {
            throw new ValidacaoException("Este email já foi cadastrado!");
        } else {
            return new FuncionarioResponse(funcionarioRepository.save(new Funcionario(funcionarioRequest.getNome(),
                funcionarioRequest.getEmail(), funcionarioRequest.getSenha())));
        }
    }
}

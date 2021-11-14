package br.edu.utfpr.parkineasy.controller;

import br.edu.utfpr.parkineasy.dto.request.FuncionarioRequest;
import br.edu.utfpr.parkineasy.dto.response.FuncionarioResponse;
import br.edu.utfpr.parkineasy.service.FuncionarioService;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gerencia/usuarios")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public FuncionarioResponse criarFuncionario(@RequestBody @Valid FuncionarioRequest funcionarioRequest) {
        return funcionarioService.criarFuncionario(funcionarioRequest);
    }
}

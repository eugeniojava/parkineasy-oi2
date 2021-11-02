package br.edu.utfpr.parkineasy.controller;

import br.edu.utfpr.parkineasy.dto.request.VagaRequest;
import br.edu.utfpr.parkineasy.dto.response.VagaResponse;
import br.edu.utfpr.parkineasy.model.enums.TipoVaga;
import br.edu.utfpr.parkineasy.service.VagaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/gerencia/vagas")
public class VagaController {
    private final VagaService vagaService;

    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @PostMapping
    public VagaResponse criarVaga(@RequestBody @Valid VagaRequest vagaRequest) {
        return vagaService.criarVaga(vagaRequest);

    }
}

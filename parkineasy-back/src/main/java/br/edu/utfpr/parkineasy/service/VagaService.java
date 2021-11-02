package br.edu.utfpr.parkineasy.service;

import br.edu.utfpr.parkineasy.dto.request.VagaRequest;
import br.edu.utfpr.parkineasy.dto.response.VagaResponse;

public interface VagaService {
    VagaResponse criarVaga(VagaRequest vagaRequest);
}

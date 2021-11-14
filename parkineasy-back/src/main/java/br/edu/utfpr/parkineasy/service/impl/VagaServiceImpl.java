package br.edu.utfpr.parkineasy.service.impl;

import br.edu.utfpr.parkineasy.dto.request.VagaRequest;
import br.edu.utfpr.parkineasy.dto.response.VagaResponse;
import br.edu.utfpr.parkineasy.exception.ValidacaoException;
import br.edu.utfpr.parkineasy.model.Vaga;
import br.edu.utfpr.parkineasy.repository.VagaRepository;
import br.edu.utfpr.parkineasy.service.VagaService;
import org.springframework.stereotype.Service;

@Service
public class VagaServiceImpl implements VagaService {
    private final VagaRepository vagaRepository;

    public VagaServiceImpl(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    @Override
    public VagaResponse criarVaga(VagaRequest vagaRequest) {
        if (vagaRepository.existsById(vagaRequest.getCodigo())) {
            throw new ValidacaoException("Vaga já Existe");
        }
        return new VagaResponse(vagaRepository.save(new Vaga(vagaRequest.getCodigo(), vagaRequest.getTipo())));
    }
}

package br.edu.utfpr.parkineasy.dto.response;

import br.edu.utfpr.parkineasy.model.Vaga;
import br.edu.utfpr.parkineasy.model.enumeration.TipoVaga;

public class VagaResponse {
    private final String codigo;
    private final String descricao;

    public VagaResponse(Vaga vaga) {
        this.codigo = vaga.getCodigo();
        this.descricao = TipoVaga.valueOf(vaga.getTipoVaga()).toString();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}

package br.edu.utfpr.parkineasy.dto.response;

import br.edu.utfpr.parkineasy.model.Vaga;
import br.edu.utfpr.parkineasy.model.enums.TipoVaga;

public class VagaResponse {


    String codigo;
    String descricao;

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

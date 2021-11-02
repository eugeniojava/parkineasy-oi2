package br.edu.utfpr.parkineasy.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class VagaRequest {
    @NotBlank
    String codigo;
    @Min(1)
    @Max(3)
    Integer tipo;

    public String getCodigo() {
        return codigo;
    }

    public Integer getTipo() {
        return tipo;
    }
}

package br.edu.utfpr.parkineasy.service;


import br.edu.utfpr.parkineasy.exception.ValidacaoException;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static br.edu.utfpr.parkineasy.helper.VagaHelper.outroVagaRequest;
import static br.edu.utfpr.parkineasy.helper.VagaHelper.umVagaRequest;
import static br.edu.utfpr.parkineasy.helper.VagaHelper.umVagaRequestInvalido;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
@Sql(scripts = "/scripts/vagas.sql")
@Transactional
public class VagaServiceTest {

    @Autowired
    VagaService vagaService;

    @Test
    public void criarVaga_deveRetornarVagaResponse_seRequestForValido() {
        assertThat(vagaService.criarVaga(umVagaRequest()))
            .extracting("codigo", "descricao")
            .containsExactly("A01", "COMUM");
    }

    @Test
    public void criarVaga_deveRetornarVagaResponse_RequestValido() {
        assertThat(vagaService.criarVaga(outroVagaRequest()))
            .extracting("codigo", "descricao")
            .containsExactly("C05", "IDOSO");
    }

    @Test
    public void criarVaga_deveRetornarException_seVagaJaExiste() {
        assertThatThrownBy(() -> vagaService.criarVaga(umVagaRequestInvalido()))
            .isExactlyInstanceOf(ValidacaoException.class)
            .hasMessage("Vaga já Existe");
    }


}

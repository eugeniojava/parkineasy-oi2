package br.edu.utfpr.parkineasy.controller;

import br.edu.utfpr.parkineasy.exception.ValidacaoException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;

import static br.edu.utfpr.parkineasy.helper.VagaHelper.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
@Sql(scripts = "/scripts/vagas.sql")
@Transactional
public class VagaControllerTest {

    @Autowired
    VagaController vagaController;

    @Test
    public void criarVaga_deveRetornarException_seVagaJaExiste() {
        assertThatThrownBy(()->vagaController.criarVaga(umVagaRequestInvalido()))
            .isExactlyInstanceOf(ValidacaoException.class)
            .hasMessage("Vaga já Existe");
    }

    @Test
    public void criarVaga_deveRetornarVagaResponse_seRequestForValido() {
        assertThat(vagaController.criarVaga(umVagaRequest()))
            .extracting("codigo","descricao")
            .containsExactly("A01","COMUM");
    }

    @Test
    public void criarVaga_deveRetornarVagaResponse_RequestValido() {
        assertThat(vagaController.criarVaga(outroVagaRequest()))
            .extracting("codigo","descricao")
            .containsExactly("C05","IDOSO");
    }
}

package br.edu.utfpr.parkineasy.controller;

import br.edu.utfpr.parkineasy.exception.ValidacaoException;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static br.edu.utfpr.parkineasy.helper.FuncionarioHelper.outroFuncionarioRequest;
import static br.edu.utfpr.parkineasy.helper.FuncionarioHelper.umFuncionarioRequest;
import static br.edu.utfpr.parkineasy.helper.FuncionarioHelper.umFuncionarioRequestInvalido;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
@Sql(scripts = "/scripts/funcionarios.sql")
@Transactional
public class FuncionarioControllerTest {

    @Autowired
    FuncionarioController funcionarioController;

    @Test
    public void criarUsuario_deveRetornarException_seUsuarioJaExiste() {
        assertThatThrownBy(() -> funcionarioController.criarUsuario(umFuncionarioRequestInvalido()))
            .isExactlyInstanceOf(ValidacaoException.class)
            .hasMessage("Este email já foi cadastrado!");
    }

    @Test
    public void criarUsuario_deveRetornarFuncionarioResponse_seRequestForValido() {
        assertThat(funcionarioController.criarUsuario(umFuncionarioRequest()))
            .extracting("nome", "email", "senha")
            .containsExactly("Bruno", "bruno@gmail.com", "12345");
    }

    @Test
    public void criarUsuario_deveRetornarFuncionarioResponse_requestValido() {
        assertThat(funcionarioController.criarUsuario(outroFuncionarioRequest()))
            .extracting("nome", "email", "senha")
            .containsExactly("Eugenio", "eugenio@gmail.com", "12345");
    }
}

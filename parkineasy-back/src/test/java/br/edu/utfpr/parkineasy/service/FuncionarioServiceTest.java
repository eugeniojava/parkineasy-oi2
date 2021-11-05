package br.edu.utfpr.parkineasy.service;

import br.edu.utfpr.parkineasy.exception.ValidacaoException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;

import static br.edu.utfpr.parkineasy.helper.FuncionarioHelper.umFuncionarioRequest;
import static br.edu.utfpr.parkineasy.helper.FuncionarioHelper.umFuncionarioRequestInvalido;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
@Sql(scripts = "/scripts/funcionarios.sql")
@Transactional
public class FuncionarioServiceTest {

    @Autowired
    FuncionarioService funcionarioService;

    @Test
    public void criarUsuario_deveRetornarException_seUsuarioJaExiste() {
        assertThatThrownBy(()->funcionarioService.criarUsuario(umFuncionarioRequestInvalido()))
            .isExactlyInstanceOf(ValidacaoException.class)
            .hasMessage("Este email já foi cadastrado!");
    }

    @Test
    public void criarUsuario_deveRetornarFuncionarioResponse_seRequestForValido() {
        assertThat(funcionarioService.criarUsuario(umFuncionarioRequest()))
            .extracting("nome", "email", "senha")
            .containsExactly("Bruno","bruno@gmail.com", "12345");
    }
}

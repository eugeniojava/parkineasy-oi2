package br.edu.utfpr.parkineasy.repository;

import br.edu.utfpr.parkineasy.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Funcionario findTopByEmail(String email);
}
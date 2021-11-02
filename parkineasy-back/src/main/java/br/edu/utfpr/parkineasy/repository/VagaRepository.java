package br.edu.utfpr.parkineasy.repository;

import br.edu.utfpr.parkineasy.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, String> {
}

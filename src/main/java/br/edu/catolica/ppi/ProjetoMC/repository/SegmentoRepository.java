package br.edu.catolica.ppi.ProjetoMC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository // essa notação é o que vai dizer que essa classe é um repositorio de Banco de Dados, tem as funciona-
// -lidades de um CRUD de banco de dados.
public interface SegmentoRepository extends JpaRepository<Segmento, UUID> {
}

package br.edu.catolica.ppi.ProjetoMC.repository;

import br.edu.catolica.ppi.ProjetoMC.model.TipoCartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoCartaoRepository extends JpaRepository<TipoCartao, UUID> {
}

package br.edu.catolica.ppi.ProjetoMC.repository;

import br.edu.catolica.ppi.ProjetoMC.model.StatusDeEntrega;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusDeEntregaRepository extends JpaRepository<StatusDeEntrega, UUID> {
}

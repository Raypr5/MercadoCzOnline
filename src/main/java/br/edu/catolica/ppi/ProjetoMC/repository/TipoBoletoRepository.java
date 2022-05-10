package br.edu.catolica.ppi.ProjetoMC.repository;

import br.edu.catolica.ppi.ProjetoMC.model.TipoBoleto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoBoletoRepository extends JpaRepository<TipoBoleto, UUID> {
}

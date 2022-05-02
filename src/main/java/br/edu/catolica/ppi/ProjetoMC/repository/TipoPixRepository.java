package br.edu.catolica.ppi.ProjetoMC.repository;

import br.edu.catolica.ppi.ProjetoMC.model.TipoPix;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoPixRepository extends JpaRepository<TipoPix, UUID> {
}

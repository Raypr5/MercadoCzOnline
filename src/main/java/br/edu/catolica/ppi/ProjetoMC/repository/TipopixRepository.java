package br.edu.catolica.ppi.ProjetoMC.repository;

import br.edu.catolica.ppi.ProjetoMC.model.TipoPix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipopixRepository extends JpaRepository<TipoPix, UUID> {
}

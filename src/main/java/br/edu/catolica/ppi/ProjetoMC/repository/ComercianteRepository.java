package br.edu.catolica.ppi.ProjetoMC.repository;

import br.edu.catolica.ppi.ProjetoMC.model.Comerciante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComercianteRepository extends JpaRepository<Comerciante, UUID> {
}

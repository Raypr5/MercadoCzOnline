package br.edu.catolica.ppi.ProjetoMC.repository;

import br.edu.catolica.ppi.ProjetoMC.model.Segmento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SegmentoRepository extends JpaRepository<Segmento, UUID> {
}

package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Estoque {
    private Double quantidade;
    private List<Produto> produtos;
}

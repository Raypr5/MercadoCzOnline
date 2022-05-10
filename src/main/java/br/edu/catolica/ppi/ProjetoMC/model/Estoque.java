package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.ArrayList;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Estoque {
    private ArrayList<Produto> produtosDaLoja;
    private Integer quantidadeDeProdutos = produtosDaLoja.size();
}

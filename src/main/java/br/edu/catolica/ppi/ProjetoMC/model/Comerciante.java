package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Comerciante extends Pessoa {

    private String razaoSocial;

    @Column(unique = true)
    private String cpf_cnpj;

    private Segmento segmento;
    private String informacaoes;
    private ArrayList<Produto> produtos;
    private boolean habilitado;
    private Compras compras;

}

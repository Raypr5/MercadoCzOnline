package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Comerciante extends Pessoa {

    @Column(unique = true)
    private String razaoSocial;
    @Column(unique = true)
    private String nomeFantasia;
    @Column(unique = true)
    private String cpf_cnpj;

    @Embedded
    private Segmento segmento;

    @Embedded
    private Estoque estoque;

    private String informacoes;

    private boolean habilitado;

    @OneToMany
    private List<Compra> pedidosRecebidos;
}

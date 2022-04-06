package br.edu.catolica.ppi.ProjetoMC.model;

import br.edu.catolica.ppi.ProjetoMC.enums.Segmento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
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

    @Enumerated(EnumType.STRING)
    private Segmento segmento;

    private String informacoes;

    @OneToOne
    @Embedded
    private Estoque estoque;

    private boolean habilitado;

    @OneToMany
    private List<Compra> pedidosRecebidos;
}

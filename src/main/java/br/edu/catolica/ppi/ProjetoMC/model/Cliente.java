package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Cliente extends  Pessoa{

    @Column(unique = true)
    private String nomeCompleto;
    @Column(unique = true)
    private String cpf;

    private LocalDate dataNascimento;

    @Embedded
    private Endereco endereco;

    @OneToMany
    private List<TipoCartao> cartoes;

    @OneToOne
    private Sacola sacola;

    @OneToOne
    private ListaDeDesejos listaDeDesejos;

    @OneToMany
    private List<Compra> comprasRealizadas;


}

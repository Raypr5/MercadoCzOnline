package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;

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

    private Date dataNascimento;

    @Embedded
    private Endereco endereco;

    /*
    private ArrayList<TipoCartao> cartoes;
    private ArrayList<Produto> sacola;
    private ArrayList<Produto> listaDeDesejos;
    private ArrayList<Compra> comprasRealizadas;

    AQUI ESTÁ COMENTANDO AINDA, POIS EU NÃO SEI COLOCAR A NOTAÇÃO EM CADA ATRIBUTADO QUE ESTÁ ASSOCIADO COM OUTRA
    CLASSE
     */
}

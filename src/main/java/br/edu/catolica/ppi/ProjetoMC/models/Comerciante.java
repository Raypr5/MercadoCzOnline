package br.edu.catolica.ppi.ProjetoMC.models;

import java.util.ArrayList;

public class Comerciante extends Pessoa {

    private String razaoSocial;
    private String cpf_cnpj;
    private Segmento segmento;
    private String informacaoes;
    private ArrayList<Produto> produtos;
    private boolean habilitado;
    private Compras compras;

}

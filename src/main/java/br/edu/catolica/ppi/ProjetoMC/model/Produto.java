package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;
    private String descricao;
    private BufferedImage foto;
    private Float valor;
    private Boolean habilitarDesconto;
    private Float valorDesconto;
    private Categoria categoria;
    private Float estoque;
    private Integer vezesComprado;
    private ArrayList<String> avaliacoes;
    private ArrayList<String> comentarios;
    private Comerciante comerciante;
}

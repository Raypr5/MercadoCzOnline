package br.edu.catolica.ppi.ProjetoMC.model;

import br.edu.catolica.ppi.ProjetoMC.enums.Categoria;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
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
    // private BufferedImage foto; PRECISO ACHAR UMA OUTRA FORMA DE COLOCAR ESSA FOTO NO BANCO
    private Float valor;
    private Boolean habilitarDesconto;
    private Float valorDesconto;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private Integer vezesComprado;

    private ArrayList<String> avaliacoes;
    private ArrayList<String> comentarios;

}

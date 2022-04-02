package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

// aqui não precisa fazer o Entity, pois ele vai embutido na tabela(classe aqui) Cliente
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String complemento;

    public Endereco cadastrarEndereco(UUID id, String rua, String bairro, String cep, String cidade, String estado, String complemento ){
        Endereco endereco = new Endereco(id, rua, bairro, cep, cidade, estado, complemento);
        return endereco;

    }

//    public Endereco removeEndereco(UUID id){
//    }
}
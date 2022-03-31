package br.edu.catolica.ppi.ProjetoMC.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
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

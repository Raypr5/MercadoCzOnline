package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

// aqui não precisa fazer o Entity, pois ele vai embutido na tabela(classe aqui) Cliente
@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Endereco {
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String complemento;

//    public Endereco removeEndereco(UUID id){
//    }
}

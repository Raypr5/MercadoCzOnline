package br.edu.catolica.ppi.ProjetoMC.model;


import br.edu.catolica.ppi.ProjetoMC.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusDeEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // private Status nome; // aqui vai ser um ENUM, ou ENVIADO, ou ENTREGUE, como tem lá na classe Status em ENUMS
}

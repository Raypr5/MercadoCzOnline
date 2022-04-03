package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TipoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}

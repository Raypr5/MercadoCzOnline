package br.edu.catolica.ppi.ProjetoMC.model;

import br.edu.catolica.ppi.ProjetoMC.enums.StatusDeEntrega;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    private TipoPagamento tipoPagamento;

    @OneToOne
    private Sacola sacola;

    @ManyToOne
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    private StatusDeEntrega statusDeEntrega;
}

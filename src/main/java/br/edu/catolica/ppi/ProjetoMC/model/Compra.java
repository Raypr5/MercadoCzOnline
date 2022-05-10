package br.edu.catolica.ppi.ProjetoMC.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
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

    private String avaliacao;

    private String comentario;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataCompra;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataRecebimento;

    @OneToOne
    private TipoPagamento tipoPagamento;

    @OneToOne
    private Sacola sacola;

    @OneToOne(cascade = CascadeType.MERGE)
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.MERGE)
    private StatusDeEntrega statusDeEntrega;
}

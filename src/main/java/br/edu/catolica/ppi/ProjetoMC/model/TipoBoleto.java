package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.net.URL;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoBoleto extends TipoPagamento{

    @Column(unique = true)
    private URL linkPdf;

    private Integer codigoDeBarra;
}

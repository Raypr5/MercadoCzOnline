package br.edu.catolica.ppi.ProjetoMC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.net.URL;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoPix extends TipoPagamento{

    @Column(unique = true)
    private Integer qrCode;

    @Column(unique = true)
    private URL link;
}

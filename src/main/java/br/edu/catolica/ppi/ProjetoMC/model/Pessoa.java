package br.edu.catolica.ppi.ProjetoMC.model;

import br.edu.catolica.ppi.ProjetoMC.enums.Perfil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataCadastramento;
    private String email;
    private String whatsapp;

    private String senha;

    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    // private BufferedImage foto; PRECISO ACHAR UMA FORMA MELHOR DE COLOCAR ESSA FOTO NO BANCO


}

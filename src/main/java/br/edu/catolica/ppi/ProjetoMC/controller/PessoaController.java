package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Pessoa;
import br.edu.catolica.ppi.ProjetoMC.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    // vai retornar todas as pessoas do banco de dados
    @GetMapping("/all")
    public ResponseEntity getAll(){
        return ResponseEntity.ok().body(pessoaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") UUID id){
        Optional<Pessoa> p = pessoaService.findById(id);
        if(pessoaService.findById(id).isPresent()){
            return ResponseEntity.ok().body(p);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}

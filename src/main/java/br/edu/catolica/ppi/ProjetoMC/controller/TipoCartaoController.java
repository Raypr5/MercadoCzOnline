package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.TipoCartao;
import br.edu.catolica.ppi.ProjetoMC.service.CartaoService;
import br.edu.catolica.ppi.ProjetoMC.service.TipoCartaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tipo-cartao")
public class TipoCartaoController {

    private final TipoCartaoService tipoCartaoService;


    public TipoCartaoController(TipoCartaoService tipoCartaoService) {
        this.tipoCartaoService = tipoCartaoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity salvarOuAtualizar(@RequestBody TipoCartao tipoCartao){
        return ResponseEntity.ok()
                .body(tipoCartaoService.salvarOuAtualizar(tipoCartao));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(tipoCartaoService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(tipoCartaoService.buscarTodos());
    }

    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestBody TipoCartao tipoCartao){
        tipoCartaoService.deletar(tipoCartao);
        return ResponseEntity.noContent().build();
    }
}


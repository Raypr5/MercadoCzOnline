package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.TipoBoleto;
import br.edu.catolica.ppi.ProjetoMC.service.TipoBoletoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tipo-boleto")
public class TipoBoletoController {

    private final TipoBoletoService tipoBoletoService;

    public TipoBoletoController(TipoBoletoService tipoBoletoService){
        this.tipoBoletoService = tipoBoletoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity salvarOuAtualizar(@RequestBody TipoBoleto tipoBoleto){
        return ResponseEntity.ok()
                .body(tipoBoletoService.salvarOuAtualizar(tipoBoleto));
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(tipoBoletoService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(tipoBoletoService.buscarTodos());
    }

    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestBody TipoBoleto tipoBoleto){
        tipoBoletoService.deletar(tipoBoleto);
        return ResponseEntity.noContent().build();
    }
}

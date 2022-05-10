package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.service.CartaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

    private final CartaoService cartaoService;


    public CartaoController(CartaoService cartaoService) {
        this.cartaoService = cartaoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity salvarOuAtualizar(@RequestBody Cartao cartao){
        return ResponseEntity.ok()
                .body(cartaoService.salvarOuAtualizar(cartao));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(cartaoService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(cartaoService.buscarTodos());
    }

    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestBody Cartao cartao){
        cartaoService.deletar(cartao);
        return ResponseEntity.noContent().build();
    }
}


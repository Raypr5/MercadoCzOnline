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

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Cartao cartao){
        return ResponseEntity.ok()
                .body(cartaoService.saveOrUpdate(cartao));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(cartaoService.findById(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(cartaoService.getAll());
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Cartao cartao){
        cartaoService.delete(cartao);
        return ResponseEntity.noContent().build();
    }
}


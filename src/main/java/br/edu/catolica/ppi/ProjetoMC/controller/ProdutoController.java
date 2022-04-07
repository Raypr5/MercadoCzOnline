package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.Produto;
import br.edu.catolica.ppi.ProjetoMC.service.CartaoService;
import br.edu.catolica.ppi.ProjetoMC.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;


    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity save(@RequestBody Produto produto){
        return ResponseEntity.ok()
                .body(produtoService.saveOrUpdate(produto));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(produtoService.findById(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(produtoService.getAll());
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Produto produto){
        produtoService.delete(produto);
        return ResponseEntity.noContent().build();
    }
}

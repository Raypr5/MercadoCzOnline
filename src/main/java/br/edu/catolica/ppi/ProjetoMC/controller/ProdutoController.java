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
    public ResponseEntity salvarOuAtualizar(@RequestBody Produto produto){
        return ResponseEntity.ok()
                .body(produtoService.salvarOuAtualizar(produto));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(produtoService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(produtoService.buscarTodos());
    }

    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestBody Produto produto){
        produtoService.deletar(produto);
        return ResponseEntity.noContent().build();
    }
}

package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Categoria;
import br.edu.catolica.ppi.ProjetoMC.model.Segmento;
import br.edu.catolica.ppi.ProjetoMC.service.CategoriaService;
import br.edu.catolica.ppi.ProjetoMC.service.SegmentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

public class CategoriaController {


    private final CategoriaService categoriaService;


    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping("/salvar")
    public ResponseEntity salvarOuAtualizar(@RequestBody Categoria categoria){
        return ResponseEntity.ok()
                .body(categoriaService.salvarOuAtualizar(categoria));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(categoriaService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(categoriaService.buscarTodos());
    }

    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestBody Categoria categoria){
        categoriaService.deletar(categoria);
        return ResponseEntity.noContent().build();
    }
}

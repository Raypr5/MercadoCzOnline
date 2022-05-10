package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Segmento;
import br.edu.catolica.ppi.ProjetoMC.model.StatusDeEntrega;
import br.edu.catolica.ppi.ProjetoMC.service.SegmentoService;
import br.edu.catolica.ppi.ProjetoMC.service.StatusDeEntregaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

public class SegmentoController {


    private final SegmentoService segmentoService;


    public SegmentoController(SegmentoService segmentoService) {
        this.segmentoService = segmentoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity salvarOuAtualizar(@RequestBody Segmento segmento){
        return ResponseEntity.ok()
                .body(segmentoService.salvarOuAtualizar(segmento));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(segmentoService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(segmentoService.buscarTodos());
    }

    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestBody Segmento segmento){
        segmentoService.deletar(segmento);
        return ResponseEntity.noContent().build();
    }
}

package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Compra;
import br.edu.catolica.ppi.ProjetoMC.model.StatusDeEntrega;
import br.edu.catolica.ppi.ProjetoMC.service.CompraService;
import br.edu.catolica.ppi.ProjetoMC.service.StatusDeEntregaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

public class StatusDeEntregaController {


    private final StatusDeEntregaService statusDeEntregaService;


    public StatusDeEntregaController(StatusDeEntregaService statusDeEntregaService) {
        this.statusDeEntregaService = statusDeEntregaService;
    }

    @PostMapping("/salvar")
    public ResponseEntity salvarOuAtualizar(@RequestBody StatusDeEntrega statusDeEntrega){
        return ResponseEntity.ok()
                .body(statusDeEntregaService.salvarOuAtualizar(statusDeEntrega));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(statusDeEntregaService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(statusDeEntregaService.buscarTodos());
    }

    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestBody StatusDeEntrega statusDeEntrega){
        statusDeEntregaService.deletar(statusDeEntrega);
        return ResponseEntity.noContent().build();
    }
}

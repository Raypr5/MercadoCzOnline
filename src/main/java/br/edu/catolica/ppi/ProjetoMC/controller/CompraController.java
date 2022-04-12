package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.Compra;
import br.edu.catolica.ppi.ProjetoMC.service.CartaoService;
import br.edu.catolica.ppi.ProjetoMC.service.CompraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/compra")
public class CompraController {

    private final CompraService compraService;


    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping("/salvar")
    public ResponseEntity save(@RequestBody Compra compra){
        return ResponseEntity.ok()
                .body(compraService.saveOrUpdate(compra));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(compraService.findById(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(compraService.getAll());
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Compra compra){
        compraService.delete(compra);
        return ResponseEntity.noContent().build();
    }
}


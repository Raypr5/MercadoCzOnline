package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.Comerciante;
import br.edu.catolica.ppi.ProjetoMC.service.CartaoService;
import br.edu.catolica.ppi.ProjetoMC.service.ComercianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/comerciante")
public class ComercianteController {

    private final ComercianteService comercianteService;


    public ComercianteController(ComercianteService comercianteService) {
        this.comercianteService = comercianteService;
    }

    @PostMapping("/salvar")
    public ResponseEntity save(@RequestBody Comerciante comerciante){
        return ResponseEntity.ok()
                .body(comercianteService.saveOrUpdate(comerciante));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(comercianteService.findById(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(comercianteService.getAll());
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Comerciante comerciante){
        comercianteService.delete(comerciante);
        return ResponseEntity.noContent().build();
    }
}


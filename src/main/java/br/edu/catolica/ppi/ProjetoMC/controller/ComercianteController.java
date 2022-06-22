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
    public ResponseEntity salvarOuAtualizar(@RequestBody Comerciante comerciante){
        try{
            return ResponseEntity.ok()
                    .body(comercianteService.salvarOuAtualizar(comerciante));
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(comercianteService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(comercianteService.buscarTodos());
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity deletar(@PathVariable("id") UUID id){
        try{
            var comerciante = comercianteService.buscarPorId(id);
            comercianteService.deletar(comerciante);
            return ResponseEntity.noContent().build();
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}


package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.TipoPix;
import br.edu.catolica.ppi.ProjetoMC.service.CartaoService;
import br.edu.catolica.ppi.ProjetoMC.service.TipoPixService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tipo-pix")
public class TipoPixController {

    private final TipoPixService tipoPixService;


    public TipoPixController(TipoPixService tipoPixService) {
        this.tipoPixService = tipoPixService;
    }

    @PostMapping("/salvar")
    public ResponseEntity salvarOuAtualizar(@RequestBody TipoPix tipoPix){
        return ResponseEntity.ok()
                .body(tipoPixService.salvarOuAtualizar(tipoPix));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(tipoPixService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(tipoPixService.buscarTodos());
    }

    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestBody TipoPix tipoPix){
        tipoPixService.deletar(tipoPix);
        return ResponseEntity.noContent().build();
    }
}


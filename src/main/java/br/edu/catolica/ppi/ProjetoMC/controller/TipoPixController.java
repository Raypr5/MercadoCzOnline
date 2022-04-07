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
    public ResponseEntity save (@RequestBody TipoPix pix){
        return ResponseEntity.ok()
                .body(tipoPixService.saveOrUpdate(pix));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(tipoPixService.findById(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(tipoPixService.getAll());
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody TipoPix pix){
        tipoPixService.delete(pix);
        return ResponseEntity.noContent().build();
    }
}

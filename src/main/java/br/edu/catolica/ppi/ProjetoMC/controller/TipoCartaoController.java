package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.Cliente;
import br.edu.catolica.ppi.ProjetoMC.model.TipoCartao;
import br.edu.catolica.ppi.ProjetoMC.service.CartaoService;
import br.edu.catolica.ppi.ProjetoMC.service.ClienteService;
import br.edu.catolica.ppi.ProjetoMC.service.TipoCartaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tipo-cartao")
public class TipoCartaoController {

    private final TipoCartaoService tipoCartaoService;

    public TipoCartaoController(TipoCartaoService tipoCartaoService) {
        this.tipoCartaoService = tipoCartaoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity save(@RequestBody TipoCartao tipoCartao){
        return ResponseEntity.ok()
                .body(tipoCartaoService.saveOrUpdate(tipoCartao));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(tipoCartaoService.findById(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(tipoCartaoService.getAll());
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody TipoCartao tipoCartao){
        tipoCartaoService.delete(tipoCartao);
        return ResponseEntity.noContent().build();
    }
}

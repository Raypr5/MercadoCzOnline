package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.TipoBoleto;
import br.edu.catolica.ppi.ProjetoMC.service.TipoBoletoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tipo-boleto")
public class TipoBoletoController {

    private final TipoBoletoService tipoBoletoService;

    public TipoBoletoController(TipoBoletoService tipoBoletoService){
        this.tipoBoletoService = tipoBoletoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity save(@RequestBody TipoBoleto tipoBoleto){
        return ResponseEntity.ok()
                .body(tipoBoletoService.saveOrUpdate(tipoBoleto));
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(tipoBoletoService.findById(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(tipoBoletoService.getAll());
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody TipoBoleto tipoBoleto){
        tipoBoletoService.delete(tipoBoleto);
        return ResponseEntity.noContent().build();
    }
}

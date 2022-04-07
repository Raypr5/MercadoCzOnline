package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.Cliente;
import br.edu.catolica.ppi.ProjetoMC.service.CartaoService;
import br.edu.catolica.ppi.ProjetoMC.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/salvar")
    public ResponseEntity save(@RequestBody Cliente cliente){
        return ResponseEntity.ok()
                .body(clienteService.saveOrUpdate(cliente));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(clienteService.findById(id));
    }

    @GetMapping("/buscar")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(clienteService.getAll());
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Cliente cliente){
        clienteService.delete(cliente);
        return ResponseEntity.noContent().build();
    }
}

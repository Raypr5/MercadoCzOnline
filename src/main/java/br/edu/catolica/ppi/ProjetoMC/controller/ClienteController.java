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
    public ResponseEntity salvarOuAtualizar(@RequestBody Cliente cliente){
        return ResponseEntity.ok()
                .body(clienteService.salvarOuAtualizar(cliente));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity pegarPorId(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(clienteService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity buscarTodos(){
        return ResponseEntity.ok().body(clienteService.buscarTodos());
    }

    @DeleteMapping("/delete")
    public ResponseEntity deletar(@RequestBody Cliente cliente){
        clienteService.deletar(cliente);
        return ResponseEntity.noContent().build();
    }
}

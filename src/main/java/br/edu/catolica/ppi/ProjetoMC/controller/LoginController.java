package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.DTO.PessoaDTO;
import br.edu.catolica.ppi.ProjetoMC.model.Pessoa;
import br.edu.catolica.ppi.ProjetoMC.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final PessoaService pessoaService;

    public LoginController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity autenticat(@RequestBody PessoaDTO pessoaDTO){
        Optional<Pessoa> user = pessoaService.login(pessoaDTO);
        if(user.isPresent()){
            return ResponseEntity.ok().body(user);
        }
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}

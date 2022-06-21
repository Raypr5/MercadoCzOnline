package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.DTO.PessoaDTO;
import br.edu.catolica.ppi.ProjetoMC.model.Pessoa;
import br.edu.catolica.ppi.ProjetoMC.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Optional<Pessoa> login(PessoaDTO pessoaDTO){
        return pessoaRepository.findByEmailAndSenha(pessoaDTO.getEmail(), pessoaDTO.getSenha());
    }
}

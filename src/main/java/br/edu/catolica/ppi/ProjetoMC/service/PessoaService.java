package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.DTO.PessoaDTO;
import br.edu.catolica.ppi.ProjetoMC.model.Pessoa;
import br.edu.catolica.ppi.ProjetoMC.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Optional<Pessoa> login(PessoaDTO pessoaDTO){
        return pessoaRepository.findByEmailAndSenha(pessoaDTO.getEmail(), pessoaDTO.getSenha());
    }

    public List<Pessoa> getAll(){
        return pessoaRepository.findAll();
    }

    public  Optional<Pessoa> findById(UUID id){
        return pessoaRepository.findById(id);
    }

}

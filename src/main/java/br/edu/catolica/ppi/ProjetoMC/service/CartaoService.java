package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CartaoService {

    @Autowired
    CartaoRepository cartaoRepository;

    public Cartao saveOrUpdate(Cartao cartao){
        return cartaoRepository.save(cartao);
    }

    public List<Cartao> getAllCartao(){
        return cartaoRepository.findAll();
    }

    public Cartao findById(UUID id){
        return cartaoRepository.findById(id).get();
    }

    public List<Cartao> getAll(){
        return cartaoRepository.findAll();
    }

    public void delete(Cartao cartao){
        Cartao c = findById(cartao.getId());
        cartaoRepository.delete(c);
    }
}

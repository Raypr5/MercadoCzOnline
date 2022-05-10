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

    public Cartao salvarOuAtualizar(Cartao cartao){
        return cartaoRepository.save(cartao);
    }

    public Cartao buscarPorId(UUID id){
        return cartaoRepository.findById(id).get();
    }

    public List<Cartao> buscarTodos(){
        return cartaoRepository.findAll();
    }

    public void deletar(Cartao cartao){
        Cartao c = buscarPorId(cartao.getId());
        cartaoRepository.delete(c);
    }
}

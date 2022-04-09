package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.Compra;
import br.edu.catolica.ppi.ProjetoMC.repository.CartaoRepository;
import br.edu.catolica.ppi.ProjetoMC.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CompraService {

    @Autowired
    CompraRepository compraRepository;

    public Compra saveOrUpdate(Compra compra){
        return compraRepository.save(compra);
    }

    public List<Compra> getAllCartao(){
        return compraRepository.findAll();
    }

    public Compra findById(UUID id){
        return compraRepository.findById(id).get();
    }

    public List<Compra> getAll(){
        return compraRepository.findAll();
    }

    public void delete(Compra compra){
        Compra c = findById(compra.getId());
        compraRepository.delete(c);
    }
}

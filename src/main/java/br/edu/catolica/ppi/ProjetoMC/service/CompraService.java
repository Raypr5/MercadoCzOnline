package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Compra;
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

    public Compra salvarOuAtualizar(Compra compra){
        return compraRepository.save(compra);
    }

    public Compra buscarPorId(UUID id){
        return compraRepository.findById(id).get();
    }

    public List<Compra> buscarTodos(){
        return compraRepository.findAll();
    }

    public void deletar(Compra compra){
        Compra c = buscarPorId(compra.getId());
        compraRepository.delete(c);
    }
}

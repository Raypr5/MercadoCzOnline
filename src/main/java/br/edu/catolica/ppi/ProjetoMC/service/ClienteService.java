package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Cliente;
import br.edu.catolica.ppi.ProjetoMC.model.Produto;
import br.edu.catolica.ppi.ProjetoMC.repository.ClienteRepository;
import br.edu.catolica.ppi.ProjetoMC.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente saveOrUpdate(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente findById(UUID id){
        return clienteRepository.findById(id).get();
    }

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    public void delete(Cliente cliente){
        Cliente c = findById(cliente.getId());
        clienteRepository.delete(c);
    }
}

package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Comerciante;
import br.edu.catolica.ppi.ProjetoMC.model.StatusDeEntrega;
import br.edu.catolica.ppi.ProjetoMC.repository.StatusDeEntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class StatusDeEntregaService {

    @Autowired
    StatusDeEntregaRepository statusDeEntregaRepository;

    public StatusDeEntrega salvarOuAtualizar(StatusDeEntrega statusDeEntrega){
        return statusDeEntregaRepository.save(statusDeEntrega);
    }

    public StatusDeEntrega buscarPorId(UUID id){
        return statusDeEntregaRepository.findById(id).get();
    }

    public List<StatusDeEntrega> buscarTodos(){
        return statusDeEntregaRepository.findAll();
    }

    public void deletar(StatusDeEntrega statusDeEntrega){
        StatusDeEntrega c = buscarPorId(statusDeEntrega.getId());
        statusDeEntregaRepository.delete(c);
    }
}

package br.edu.catolica.ppi.ProjetoMC.service;


import br.edu.catolica.ppi.ProjetoMC.model.Comerciante;
import br.edu.catolica.ppi.ProjetoMC.repository.ComercianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ComercianteService {

    @Autowired
    ComercianteRepository comercianteRepository;

    public Comerciante salvarOuAtualizar(Comerciante comerciante){
        return comercianteRepository.save(comerciante);
    }

    public Comerciante buscarPorId(UUID id){
        return comercianteRepository.findById(id).get();
    }

    public List<Comerciante> buscarTodos(){
        return comercianteRepository.findAll();
    }

    public void deletar(Comerciante comerciante){
        Comerciante c = buscarPorId(comerciante.getId());
        comercianteRepository.delete(c);
    }
}

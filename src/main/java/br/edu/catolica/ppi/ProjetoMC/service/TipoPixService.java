package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.TipoPix;
import br.edu.catolica.ppi.ProjetoMC.repository.TipoPixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TipoPixService {

    @Autowired
    TipoPixRepository tipoPixRepository;

    public TipoPix saveOrUpdate(TipoPix tipoPix){
        return tipoPixRepository.save(tipoPix);
    }

    public TipoPix findById(UUID id){
        return tipoPixRepository.findById(id).get();
    }

    public List<TipoPix> getAll(){
        return tipoPixRepository.findAll();
    }

    public void delete(TipoPix tipoPix){
        TipoPix c = findById(tipoPix.getId());
        tipoPixRepository.delete(c);
    }
}

package br.edu.catolica.ppi.ProjetoMC.service;



import br.edu.catolica.ppi.ProjetoMC.model.TipoCartao;
import br.edu.catolica.ppi.ProjetoMC.repository.TipoCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TipoCartaoService {

    @Autowired
    TipoCartaoRepository tipoCartaoRepository;

    public TipoCartao saveOrUpdate(TipoCartao tipoCartao){
        return tipoCartaoRepository.save(tipoCartao);
    }

    public TipoCartao findById(UUID id){
        return tipoCartaoRepository.findById(id).get();
    }

    public List<TipoCartao> getAll(){
        return tipoCartaoRepository.findAll();
    }

    public void delete(TipoCartao tipoCartao){
        TipoCartao c = findById(tipoCartao.getId());
        tipoCartaoRepository.delete(c);
    }
}

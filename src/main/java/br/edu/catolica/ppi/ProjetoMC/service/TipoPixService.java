package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.TipoPix;

import br.edu.catolica.ppi.ProjetoMC.repository.TipopixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TipoPixService {
    @Autowired
    TipopixRepository tipoPixRepository;

    public TipoPix saveOrUpdate(TipoPix pix){
        return tipoPixRepository.save(pix);
    }

    public List<TipoPix> getAllTipoPixes(){
        return tipoPixRepository.findAll();
    }

    public TipoPix findById(UUID id){
        return tipoPixRepository.findById(id).get();
    }

    public List<TipoPix> getAll(){
        return tipoPixRepository.findAll();
    }

    public void delete(TipoPix pix){
        TipoPix pix1 = findById(pix.getId());
        tipoPixRepository.delete(pix1);
    }
}

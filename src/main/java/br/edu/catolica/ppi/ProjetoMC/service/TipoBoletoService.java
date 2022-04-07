package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.TipoBoleto;
import br.edu.catolica.ppi.ProjetoMC.repository.TipoBoletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TipoBoletoService {

    @Autowired
    TipoBoletoRepository tipoBoletoRepository;

    public TipoBoleto saveOrUpdate(TipoBoleto tipoBoleto){
        return tipoBoletoRepository.save(tipoBoleto);
    }

    public List<TipoBoleto> getAll(){
        return tipoBoletoRepository.findAll();
    }

    public TipoBoleto findById(UUID id){
        return tipoBoletoRepository.findById(id).get();
    }

    public void delete(TipoBoleto tipoBoleto){
        TipoBoleto t = findById(tipoBoleto.getId());
        tipoBoletoRepository.delete(t);
    }
}

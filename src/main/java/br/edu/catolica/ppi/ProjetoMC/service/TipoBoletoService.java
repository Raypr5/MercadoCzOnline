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

    public TipoBoleto salvarOuAtualizar(TipoBoleto tipoBoleto){
        return tipoBoletoRepository.save(tipoBoleto);
    }

    public List<TipoBoleto> buscarTodos(){
        return tipoBoletoRepository.findAll();
    }

    public TipoBoleto buscarPorId(UUID id){
        return tipoBoletoRepository.findById(id).get();
    }

    public void deletar(TipoBoleto tipoBoleto){
        TipoBoleto t = buscarPorId(tipoBoleto.getId());
        tipoBoletoRepository.delete(t);
    }
}

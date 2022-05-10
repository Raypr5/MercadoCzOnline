package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Compra;
import br.edu.catolica.ppi.ProjetoMC.model.Segmento;
import br.edu.catolica.ppi.ProjetoMC.repository.CompraRepository;
import br.edu.catolica.ppi.ProjetoMC.repository.SegmentoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.Segment;
import java.util.List;
import java.util.UUID;

public class SegmentoService {


    @Autowired
    SegmentoRepository segmentoRepository;

    public Segmento salvarOuAtualizar(Segmento segmento){
        return segmentoRepository.save(segmento);
    }

    public Segmento buscarPorId(UUID id){
        return segmentoRepository.findById(id).get();
    }

    public List<Segmento> buscarTodos(){
        return segmentoRepository.findAll();
    }

    public void deletar(Segmento segmento){
        Segmento c = buscarPorId(segmento.getId());
        segmentoRepository.delete(c);
    }
}

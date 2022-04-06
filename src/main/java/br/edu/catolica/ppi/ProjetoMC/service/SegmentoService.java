package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.repository.SegmentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentoService {

    @Autowired
    SegmentoRepository segmentoRepository;

    public Segmento saveOrUpdate(Segmento segmento){
        return segmentoRepository.save(segmento);
    }

    public List<Segmento> getAllSegmento(){
        return segmentoRepository.findAll();
    }
}

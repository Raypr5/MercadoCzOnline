package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Cartao;
import br.edu.catolica.ppi.ProjetoMC.model.Produto;
import br.edu.catolica.ppi.ProjetoMC.repository.CartaoRepository;
import br.edu.catolica.ppi.ProjetoMC.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto saveOrUpdate(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto findById(UUID id){
        return produtoRepository.findById(id).get();
    }

    public List<Produto> getAll(){
        return produtoRepository.findAll();
    }

    public void delete(Produto produto){
        Produto c = findById(produto.getId());
        produtoRepository.delete(c);
    }
}

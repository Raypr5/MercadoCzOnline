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

    public Produto salvarOuAtualizar(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto buscarPorId(UUID id){
        return produtoRepository.findById(id).get();
    }

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }

    public void deletar(Produto produto){
        Produto c = buscarPorId(produto.getId());
        produtoRepository.delete(c);
    }
}

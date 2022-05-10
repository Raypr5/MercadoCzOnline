package br.edu.catolica.ppi.ProjetoMC.service;

import br.edu.catolica.ppi.ProjetoMC.model.Categoria;
import br.edu.catolica.ppi.ProjetoMC.model.StatusDeEntrega;
import br.edu.catolica.ppi.ProjetoMC.repository.CategoriaRepository;
import br.edu.catolica.ppi.ProjetoMC.repository.StatusDeEntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class CategoriaService {


    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria salvarOuAtualizar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria buscarPorId(UUID id){
        return categoriaRepository.findById(id).get();
    }

    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }

    public void deletar(Categoria categoria){
        Categoria c = buscarPorId(categoria.getId());
        categoriaRepository.delete(c);
    }
}

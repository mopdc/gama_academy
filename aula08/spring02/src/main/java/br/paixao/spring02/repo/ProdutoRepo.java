package br.paixao.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.paixao.spring02.model.Produto;

//CRUD = Create, Read, Update, Delete
public interface ProdutoRepo extends CrudRepository<Produto, Long>{

    public Produto findByNome(String nome);
    
    
}

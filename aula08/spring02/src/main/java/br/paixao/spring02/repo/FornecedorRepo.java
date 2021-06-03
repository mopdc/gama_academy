package br.paixao.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.paixao.spring02.model.Fornecedor;

public interface FornecedorRepo extends CrudRepository<Fornecedor, Long> {
    
}

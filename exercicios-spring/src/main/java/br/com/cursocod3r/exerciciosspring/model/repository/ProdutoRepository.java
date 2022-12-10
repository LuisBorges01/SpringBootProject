package br.com.cursocod3r.exerciciosspring.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cursocod3r.exerciciosspring.model.entites.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}

package br.com.cursocod3r.exerciciosspring.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursocod3r.exerciciosspring.model.entites.Produto;
import br.com.cursocod3r.exerciciosspring.model.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
		
	@Autowired	
	private ProdutoRepository produtoRepository;
	
	@PostMapping//Método de adicionar
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping(path = "/get")//Método de Busca
	public Iterable<Produto> obterProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutoPorPagina(@PathVariable int numeroPagina){
		return produtoRepository.findAll();
	}
	
	
	
	
	
	
	@GetMapping(path = "/{id}")//Método de busca por id
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@PutMapping//Método de alteração
	public Produto alterarProduct(Produto produto){
		produtoRepository.save (produto);
		return produto;
	}
	
	@DeleteMapping(path = "/{id}") //Método deletar 
	public void exlcuirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	/*@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})//Método de adicionar
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}*/
}

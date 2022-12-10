package br.com.cursocod3r.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import models.Cliente;

@RestController
@RequestMapping("/controller")

public class ClienteController {
	@GetMapping
	public Cliente obterCliente() {
		return new Cliente(91, "Mário Germano", "312.312.321-01");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Cristian Amaral", "645.654.798-32");
	}
	
	/*@GetMapping()
	public Cliente porId(@RequestParam(name = "id", defaultValue = "1")int id) {
		return new Cliente(id, "Artur Alves", "111.222.888-21");
	}*/
	
	@GetMapping("/{n1}/{n2}")
	public int soma(@PathVariable int n1, @PathVariable int n2) {
		return n1 + n2;
	}
	
	@GetMapping("/subtrair")
	public int subtrair(
			@RequestParam(name = "a") int a,
			@RequestParam(name = "b") int b) {
		return a - b;
	}
	

}

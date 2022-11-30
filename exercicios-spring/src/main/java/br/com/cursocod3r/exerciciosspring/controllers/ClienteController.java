package br.com.cursocod3r.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
		return new Cliente(id, "Gabriela Amaral", "645.654.798-32");
	}
	

}

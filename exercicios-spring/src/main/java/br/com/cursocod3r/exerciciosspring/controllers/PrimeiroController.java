package br.com.cursocod3r.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Cliente;

@RestController
public class PrimeiroController {
	@GetMapping
	public String aqui() {
		return "O Luis é gente fina";
	}
	
	@GetMapping(path = "/clientes/qualquer")
	public Cliente obterCliente() {
		return new Cliente(12, "Luis Eduardo", "/312.321.645-00");
	}
	
	


	/*@GetMapping
	public Cliente clientControl() {
		return new Cliente(12, "João", "132.321.321-15");
	}*/
	
}

/*@RequestMapping(method = RequestMethod.GET, path = "/luise")
	public String ola(){
		return "Olá, mundo SpringBoot! O Luis é bonitão";
	}
	
	@GetMapping(path = "/saudacao")
	public String test() {
		return "Olha só o teste, raaapaiz!";
	}
 */
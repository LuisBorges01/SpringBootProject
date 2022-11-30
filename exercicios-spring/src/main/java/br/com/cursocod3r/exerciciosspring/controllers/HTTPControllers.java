package br.com.cursocod3r.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodo")
public class HTTPControllers {

	@GetMapping
	public String get() {
		return "Requisição GET";
	}
	@PostMapping
	public String post() {
		return "Requisição POST";
	}
	@PutMapping
	public String put() {
		return "Requisição PUT";
	}
	@PatchMapping
	public String patch() {
		return "Requisição PATCH";
	}
	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";
	}
}

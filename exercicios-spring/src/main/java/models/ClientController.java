package models;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping(path = "/clientes/lindo")
	public Cliente obterCliente() {
		return new Cliente(20, "João", "123.166.161-01");
	}
}






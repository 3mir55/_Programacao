package br.com.essyx.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.essyx.exerciciossb.model.entities.Cliente;

@RestController 
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
	
	@GetMapping("/{id}") //par de chaves diz q é um valor variável
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "João Augusto", "111.222.333-44");
	}
}

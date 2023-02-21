package com.clientes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	@GetMapping("/cliente")
	public String clientes() {
		return "Clientes";
	}
	
	
}

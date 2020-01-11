package com.example.carros.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping()
	public String get() {
		return "API dos Carros";
	}
	
	
	/*@PostMapping("/login/{login}/senha/{senha}")
	public String login(@PathVariable("login") String login, @PathVariable("senha") String senha) {
		return "Login: " + login + ", senha: "+ senha;
	}
	
    @GetMapping("/carros/{id}")
	public String getcarroById(@PathVariable("id") Long id) {
		return "carro by id: " + id;
	}
	
	@GetMapping("/carros/tipo/{tipo}")
	public String getcarroByTipo(@PathVariable("tipo") String tipo) {
		return "lista de carros: " + tipo;
	}*/
	
}
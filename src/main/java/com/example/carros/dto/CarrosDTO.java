package com.example.carros.dto;

import com.example.carros.model.Carro;

import lombok.Data;

public class CarrosDTO {

	@Data
	private Long id; 
	private String nome;
	private String tipo;
	
	public void CarroDTO(Carro c) {
		this.id = c.getId();
		this.nome = c.getNome();
		this.tipo = c.getTipo();
	}

}

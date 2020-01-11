package com.example.carros.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carros.model.Carro;
import com.example.carros.repository.CarroRepository;


@Service 
public class CarroService {
	
	@Autowired 
	private CarroRepository rep;
	
	public Iterable<Carro> getCarros() {
		return rep.findAll();
	}
	
	public Optional<Carro> getCarroById(Long id) {
		return rep.findById(id);
	}
	
	public Optional<Carro> getCarroByTipo(String tipo) {
		return rep.findByTipo(tipo);
	}
	
	public List<Carro> getCarrosFake() {
		List<Carro> carros = new ArrayList<>();

		carros.add(new Carro(1L, "Fusca"));
		carros.add(new Carro(2L, "Brasilia"));
		carros.add(new Carro(3L, "Chevette"));
		
		return carros;
	}

	public Carro save(Carro carro) {
		return rep.save(carro);
	}
	
}
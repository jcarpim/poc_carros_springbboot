package com.example.carros.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.carros.model.Carro;

public interface CarroRepository extends CrudRepository<Carro, Long>{

	Optional<Carro> findByTipo(String tipo);

}

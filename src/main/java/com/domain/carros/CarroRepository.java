package com.domain.carros;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CarroRepository extends CrudRepository<Carro, Long>{

	Optional<Carro> findByTipo(String tipo);

}

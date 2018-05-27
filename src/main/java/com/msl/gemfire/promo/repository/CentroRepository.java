package com.msl.gemfire.promo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.msl.gemfire.promo.entity.Centro;
import com.msl.gemfire.promo.entity.Promocion;

public interface CentroRepository extends CrudRepository<Centro,Long> {
	public Optional<Centro> findById(Long id);
	public Iterable<Centro> findByCentroo(String centroo);
	public Iterable<Centro> findByName(String centroo);
	public Iterable<Promocion> findPromocionesByCentroo(String centroo);
	public Iterable<Promocion> findPromocionesById(Long id);
	public Iterable<Promocion> findPromocionesByName(String name);
}
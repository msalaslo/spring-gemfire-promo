package com.msl.gemfire.promo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.msl.gemfire.promo.entity.Marca;
import com.msl.gemfire.promo.entity.Promocion;

public interface MarcaRepository extends CrudRepository<Marca,Long> {
	public Optional<Marca> findById(Long id);
	public Iterable<Marca> findByCmarmuma(String cmarmuma);
	public Iterable<Marca> findByName(String name);
	public Iterable<Promocion> findPromocionesById(Long id);
	public Iterable<Promocion> findPromocionesByName(String name);
	public Iterable<Promocion> findPromocionesByCmarmuma(String cmarmuma);
}
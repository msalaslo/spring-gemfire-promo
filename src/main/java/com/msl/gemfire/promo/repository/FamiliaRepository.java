package com.msl.gemfire.promo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.msl.gemfire.promo.entity.Familia;
import com.msl.gemfire.promo.entity.Promocion;

public interface FamiliaRepository extends CrudRepository<Familia,Long> {
	public Optional<Familia> findById(Long id);
	public Iterable<Familia> findByCfamilia(String cfamilia);
	public Iterable<Familia> findByName(String name);
	Iterable<Promocion> findPromocionesById(Long id);
	Iterable<Promocion> findPromocionesByName(String name);
	Iterable<Promocion> findPromocionesByCfamilia(String cfamilia);
}
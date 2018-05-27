package com.msl.gemfire.promo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.msl.gemfire.promo.entity.Empresa;
import com.msl.gemfire.promo.entity.Promocion;

public interface EmpresaRepository extends CrudRepository<Empresa,Long> {
	public Optional<Empresa> findById(Long id);
	public Iterable<Empresa> findByCempresa(String cempresa);
	public Iterable<Empresa> findByName(String cempresa);
	public Iterable<Promocion> findPromocionesByCempresa(String cempresa);
	public Iterable<Promocion> findPromocionesById(Long id);
	public Iterable<Promocion> findPromocionesByName(String name);
}
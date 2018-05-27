package com.msl.gemfire.promo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.msl.gemfire.promo.entity.Promocion;
 
public interface PromocionRepository extends CrudRepository<Promocion,Long> {
	public Promocion findByCodpromoci(String codpromoci);
    public List<Promocion> findByCanlvnta(String canlvnta);   
}
package com.msl.gemfire.promo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msl.gemfire.promo.entity.Centro;
import com.msl.gemfire.promo.entity.Promocion;
import com.msl.gemfire.promo.repository.CentroRepository;

@Service
public class CentroService {

	@Autowired
	CentroRepository repository;
	
    public Optional<Centro> findByid(Long id){
    	return repository.findById(id);
    }
    
    public Iterable<Centro> findByName(String name){
    	return repository.findByName(name);
    }
    
    public Iterable<Centro> findByCentroo(String centroo){
    	return repository.findByCentroo(centroo);
    }
    
    public Iterable<Promocion> findPromocionesById(Long id){
    	return repository.findPromocionesById(id);
    }
    
    public Iterable<Promocion> findPromocionesByCentroo(String centroo){
    	return repository.findPromocionesByCentroo(centroo);
    }
    
    public Iterable<Promocion> findPromocionesByName(String name){
    	return repository.findPromocionesByName(name);
    }

	public Centro save(Centro product) {
		return repository.save(product);
	}
}

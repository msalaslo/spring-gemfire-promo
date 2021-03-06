package com.msl.gemfire.promo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msl.gemfire.promo.entity.Promocion;
import com.msl.gemfire.promo.repository.PromocionRepository;

@Service
public class PromocionService {

	@Autowired
	PromocionRepository repository;
	
//    public Promocion findByid(Long id){
//    	return repository.findOne(id);
//    }
    
    public Promocion findByCodpromoci(String codpromoci){
    	return repository.findByCodpromoci(codpromoci);
    }
    
    public Iterable<Promocion> findByCanlvnta(String canlvnta){
    	return repository.findByCanlvnta(canlvnta);
    }
    
	public Promocion save(Promocion promocion) {
		return repository.save(promocion);
	}
}

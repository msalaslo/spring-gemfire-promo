package com.msl.gemfire.promo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("barra")
public class Barra {
	
	@Id
    public Long id;
	
	public String cbarraaa;
	
	public Barra() {
	}
	
	@PersistenceConstructor
	public Barra(String cbarraaa) {
		super();
		this.cbarraaa = cbarraaa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCbarraaa() {
		return cbarraaa;
	}

	public void setCbarraaa(String cbarraaa) {
		this.cbarraaa = cbarraaa;
	}

}

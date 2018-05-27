package com.msl.gemfire.promo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("fabrica")
public class Fabrica {
	
	@Id 
    public Long id;
	
//	@Index
	public String cfabrica;
	
	public Fabrica() {
	}
	
	@PersistenceConstructor
	public Fabrica(String cfabrica) {
		super();
		this.cfabrica = cfabrica;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCfabrica() {
		return cfabrica;
	}

	public void setCfabrica(String cfabrica) {
		this.cfabrica = cfabrica;
	}

}

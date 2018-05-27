package com.msl.gemfire.promo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("division")
public class Division {
	
	@Id 
    public Long id;
	
	public String cdivisio;
	
	public Division() {
	}
	
	@PersistenceConstructor
	public Division(String cdivisio) {
		super();
		this.cdivisio = cdivisio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCdivisio() {
		return cdivisio;
	}

	public void setCdivisio(String cdivisio) {
		this.cdivisio = cdivisio;
	}

}

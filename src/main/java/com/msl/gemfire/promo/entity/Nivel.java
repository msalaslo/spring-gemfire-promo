package com.msl.gemfire.promo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("nivel")
public class Nivel {
	
	@Id 
    public Long id;
	
//	@Index
	public String cniveln;
	
	public Nivel() {
	}
	
	@PersistenceConstructor
	public Nivel(String cniveln) {
		super();
		this.cniveln = cniveln;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCniveln() {
		return cniveln;
	}

	public void setCniveln(String cniveln) {
		this.cniveln = cniveln;
	}

}

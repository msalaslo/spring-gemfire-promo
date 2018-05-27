package com.msl.gemfire.promo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("talla")
public class Talla {
	
	@Id 
    public Long id;
	
//	@Index
	public String ctallaec;
	
	public Talla() {}
	
	@PersistenceConstructor
	public Talla(String ctallaec) {
		super();
		this.ctallaec = ctallaec;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCtallaec() {
		return ctallaec;
	}

	public void setCtallaec(String ctallaec) {
		this.ctallaec = ctallaec;
	}

}

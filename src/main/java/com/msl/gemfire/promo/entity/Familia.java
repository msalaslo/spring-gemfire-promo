package com.msl.gemfire.promo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("familia")
public class Familia implements Promocionable, RelacionableParent{
	
	@Id 
    public Long id;
	
//	@Index
	public String cfamilia;
	
//	@Relationship(type = "PROMOTED")
	public List<Promocion> promociones;
	
	public String name;
	
	public Familia() {
	}
	
	@PersistenceConstructor
	public Familia(String cfamilia, String name) {
		super();
		this.cfamilia = cfamilia;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCfamilia() {
		return cfamilia;
	}

	public void setCfamilia(String cfamilia) {
		this.cfamilia = cfamilia;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(List<Promocion> promociones) {
		this.promociones = promociones;
	}

}

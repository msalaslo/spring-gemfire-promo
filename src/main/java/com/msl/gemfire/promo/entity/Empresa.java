package com.msl.gemfire.promo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("empresa")
public class Empresa implements Promocionable,RelacionableParent{
	
	@Id 
    public Long id;
		
//	@Index
	public String cempresa;
	
	public String name;
	
//	@Relationship(type = "PROMOTED")
	private List<Promocion> promociones;
	
	public List<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(List<Promocion> promociones) {
		this.promociones = promociones;
	}
	
	public Empresa() {
	}
	
	@PersistenceConstructor
	public Empresa(String cempresa, String name) {
		super();
		this.cempresa = cempresa;
		this.name= name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCempresa() {
		return cempresa;
	}

	public void setCempresa(String cempresa) {
		this.cempresa = cempresa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

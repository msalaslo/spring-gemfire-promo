package com.msl.gemfire.promo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("departamento")
public class Departamento {

	@Id 
    public Long id;
	
	public String cdepartm;
	
	public Departamento() {
	}
	
	@PersistenceConstructor
	public Departamento(String cdepartm) {
		super();
		this.cdepartm = cdepartm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCdepartm() {
		return cdepartm;
	}

	public void setCdepartm(String cdepartm) {
		this.cdepartm = cdepartm;
	}





}

package com.msl.gemfire.promo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("centro")
public class Centro extends AbstractPromocionable implements Relacionable,RelacionableParent {
	
	@Id 
    public Long id;
	
	public String centroo;
		
	private List<Promocion> promociones;

	public List<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(List<Promocion> promociones) {
		this.promociones = promociones;
	}
	
	private Empresa empresa;
	
	public Centro() {
	}
	
	@PersistenceConstructor
	public Centro(String centroo, String name) {
		super();
		this.centroo = centroo;
		super.setName(name);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCentroo() {
		return centroo;
	}

	public void setCentroo(String centroo) {
		this.centroo = centroo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}



}

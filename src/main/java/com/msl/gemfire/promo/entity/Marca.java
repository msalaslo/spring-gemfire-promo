package com.msl.gemfire.promo.entity;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("marca")
public class Marca implements Promocionable, Relacionable, RelacionableParent{
			
	@Id 
	public Long id;
		
//	@Index
	private String cmarmuma;
				
//	@Relations(edges = MarcaPromocion.class, lazy = true)
//	@Relationship(type = "PROMOTED")
	public List<Promocion> promociones;
	
	private String name; 
	
	public Marca() {
		super();
	}
	
	@PersistenceConstructor
	public Marca(String cmarmuma, String name) {
		super();
		this.cmarmuma = cmarmuma;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(List<Promocion> promociones) {
		this.promociones = promociones;
	}

	public String getCmarmuma() {
		return cmarmuma;
	}

	public void setCmarmuma(String cmarmuma) {
		this.cmarmuma = cmarmuma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this).
        		append("id", id).
                append("cmarmuma", cmarmuma).
                append("name", name).
                append("promociones", promociones).
        		toString();
    }
}

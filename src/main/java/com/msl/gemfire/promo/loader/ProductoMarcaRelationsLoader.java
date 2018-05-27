package com.msl.gemfire.promo.loader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.msl.gemfire.promo.entity.EntityUtils;
import com.msl.gemfire.promo.entity.Marca;
import com.msl.gemfire.promo.entity.Producto;
import com.msl.gemfire.promo.entity.Relacionable;
import com.msl.gemfire.promo.entity.RelacionableParent;
import com.msl.gemfire.promo.repository.MarcaRepository;
import com.msl.gemfire.promo.repository.ProductoRepository;


@Component
public class ProductoMarcaRelationsLoader extends AbstractRelacionableRepositoryLoader implements IRelacionableRepositoryLoader{
	@Autowired
	private ProductoRepository productoRepo;
	
	@Autowired
	private MarcaRepository marcaRepo;
	
	@Override
	public void loadRelaciones() {
		super.loadRelaciones(EntityUtils.toRelacionable(productoRepo.findAll()), EntityUtils.toRelacionableParent(marcaRepo.findAll()));
	}
	
	@Override
	public void deleteRelaciones() {
		List<Producto> productos = productoRepo.findAll();
		for (Producto producto : productos) {
			Marca marcasProd = producto.getMarca();
			if(marcasProd != null) {
				producto.setMarca(null);
				productoRepo.save(producto);
			}
		}
	}

	@Override
	public void save(Relacionable relacionable, RelacionableParent parent) {
		Producto producto = (Producto)relacionable;
		producto.setMarca((Marca)parent);
		productoRepo.save(producto);
	}
}

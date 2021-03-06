package com.msl.gemfire.promo.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.msl.gemfire.promo.entity.Centro;
import com.msl.gemfire.promo.entity.Empresa;
import com.msl.gemfire.promo.entity.EntityUtils;
import com.msl.gemfire.promo.entity.Relacionable;
import com.msl.gemfire.promo.entity.RelacionableParent;
import com.msl.gemfire.promo.repository.CentroRepository;
import com.msl.gemfire.promo.repository.EmpresaRepository;


@Component
public class CentroEmpresaRelationsLoader extends AbstractRelacionableRepositoryLoader implements IRelacionableRepositoryLoader{
	
	@Autowired
	private CentroRepository centroRepo;
	
	@Autowired
	private EmpresaRepository empresaRepo;
		
	@Override
	public void loadRelaciones() {
		super.loadRelaciones(EntityUtils.toRelacionable(centroRepo.findAll()), EntityUtils.toRelacionableParent(empresaRepo.findAll()));
	}
	
	@Override
	public void deleteRelaciones() {
		Iterable<Centro> centros = centroRepo.findAll();
		for (Centro centro : centros) {
			Empresa empresasProd = centro.getEmpresa();
			if(empresasProd != null) {
				centro.setEmpresa(null);
				centroRepo.save(centro);
			}
		}
	}

	@Override
	public void save(Relacionable relacionable, RelacionableParent parent) {
		Centro centro = (Centro)relacionable;
		centro.setEmpresa((Empresa)parent);
		centroRepo.save(centro);
	}
}

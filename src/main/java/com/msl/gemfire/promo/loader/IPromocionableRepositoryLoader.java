package com.msl.gemfire.promo.loader;

import com.msl.gemfire.promo.entity.Promocion;
import com.msl.gemfire.promo.entity.Promocionable;

public interface IPromocionableRepositoryLoader {
	public void loadPromociones();
	public void deletePromociones();
	public void loadPromociones(Iterable<Promocionable> promocionables);
	public void save(Promocionable promocionable, Promocion promocion);
}

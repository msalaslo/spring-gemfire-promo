package com.msl.gemfire.promo.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msl.gemfire.promo.entity.Producto;
import com.msl.gemfire.promo.entity.Promocion;

@Repository
public interface ProductoRepository extends CrudRepository<Producto,Long> {
	public Optional<Producto> findById(Long id);
	public Iterable<Producto> findByReferencia(String referencia);
	public Producto findByName(String name);
	public List<Producto> findAll();
	Iterable<Promocion> findPromocionesById(Long id);
	Iterable<Promocion> findPromocionesByName(String name);
	Iterable<Promocion> findPromocionesByReferencia(String referencia);
	@Query("MATCH (n:`producto`) WHERE n.`referencia` = { `referencia_0` } WITH n RETURN n,"
			+ "[ [ (n)-[r_m1:`MARCA`]->(m1:`marca`) | [ r_m1, m1 ] ], "
			+ "[ (n)-[r_c1:`CENTRO`]->(c1:`centro`) | [ r_c1, c1 ] ], "
			+ "[ (n)-[r_p1:`PROMOTED`]->(p1:`promocion`) | [ r_p1, p1 ] ], "
			+ "[ (n)-[r_f1:`FAMILIA`]->(f1:`familia`) | [ r_f1, f1 ] ] ], ID(n)")
	Iterable<Promocion> findAllPromocionesById(@Param("id") Long value);
	@Query("MATCH (n:`producto`) RETURN v")
	public Stream<Producto> findAllAsStream();
}
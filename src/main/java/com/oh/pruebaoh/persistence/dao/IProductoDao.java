package com.oh.pruebaoh.persistence.dao;

import com.oh.pruebaoh.domain.dto.ProductoDTO;
import com.oh.pruebaoh.persistence.projections.IProducto;
import oh.pruebaoh.ohentitymodel.entidades.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository<Producto,Long> {

    @Query(value = "SELECT * FROM producto p ORDER BY p.id ASC", nativeQuery = true )
    Page<IProducto> findProductos(Pageable pageable);
}

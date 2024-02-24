package com.oh.pruebaoh.persistence.repository;

import com.oh.pruebaoh.domain.dto.ProductoDTO;
import com.oh.pruebaoh.persistence.dao.IClienteDao;
import com.oh.pruebaoh.persistence.dao.IProductoDao;
import com.oh.pruebaoh.persistence.projections.IProducto;
import oh.pruebaoh.ohentitymodel.entidades.Cliente;
import oh.pruebaoh.ohentitymodel.entidades.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepository {
    @Autowired
    IProductoDao dao;

    public Page<IProducto> findProductos(Pageable page){
        return dao.findProductos(page);
    }

    public Producto saveProducto(Producto producto){
        return dao.save(producto);
    }

    public void deleteProducto(Producto producto){
        dao.delete(producto);
    }
}

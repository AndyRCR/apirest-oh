package com.oh.pruebaoh.domain.service;

import com.oh.pruebaoh.domain.dto.ClienteDTO;
import com.oh.pruebaoh.domain.dto.ProductoDTO;
import com.oh.pruebaoh.persistence.projections.IProducto;
import com.oh.pruebaoh.persistence.repository.ClienteRepository;
import com.oh.pruebaoh.persistence.repository.ProductoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.oh.pruebaoh.util.mapper.ClienteMapper;
import com.oh.pruebaoh.util.mapper.ProductoMapper;
import oh.pruebaoh.ohentitymodel.entidades.Cliente;
import oh.pruebaoh.ohentitymodel.entidades.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    ProductoMapper productoConversor;

    public Page<IProducto> findProductos(Pageable page){
        return productoRepository.findProductos(page);
    }

    public void saveProducto(ProductoDTO productoDTO) {
        Producto producto = productoConversor.productoDTOToProducto(productoDTO);
        productoRepository.saveProducto(producto);
    }

    public void deleteProducto(ProductoDTO productoDTO){
        Producto producto = productoConversor.productoDTOToProducto(productoDTO);
        productoRepository.deleteProducto(producto);
    }
}

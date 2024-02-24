package com.oh.pruebaoh.controller;

import com.oh.pruebaoh.domain.dto.ClienteDTO;
import com.oh.pruebaoh.domain.dto.ProductoDTO;
import com.oh.pruebaoh.domain.service.ClienteService;
import com.oh.pruebaoh.persistence.projections.IProducto;
import org.springframework.data.domain.Page;
import com.oh.pruebaoh.domain.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @Operation(description = "Obtiene los productos paginados", tags = "Productos")
    @GetMapping("/")
    public Page<IProducto> findProductos(Pageable page){
        return productoService.findProductos(page);
    }

    @Operation(description = "Registrar producto", summary = "Registro Producto")
    @PostMapping("/saveproducto")
    public ResponseEntity<Object> saveProducto(@RequestBody ProductoDTO productoDTO) {
        productoService.saveProducto(productoDTO);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @Operation(description = "Eliminar producto", summary = "Eliminación Producto")
    @PostMapping("/deleteproducto")
    public ResponseEntity<Object> deleteProducto(@RequestBody ProductoDTO productoDTO) {
        productoService.deleteProducto(productoDTO);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}

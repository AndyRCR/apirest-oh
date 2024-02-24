package com.oh.pruebaoh.util.mapper;

import com.oh.pruebaoh.domain.dto.ProductoDTO;
import oh.pruebaoh.ohentitymodel.entidades.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "precio", target = "precio")
    })
    ProductoDTO productoToProductoDTO(Producto producto);

    List<ProductoDTO> productoToProductoDTO(List<Producto> producto);

    @InheritInverseConfiguration
    Producto productoDTOToProducto(ProductoDTO productoDTO);

    List<Producto> productoDTOToProducto(List<ProductoDTO> productoDTO);
}

package com.oh.pruebaoh.util.mapper;

import com.oh.pruebaoh.domain.dto.DetalleVentaDTO;
import oh.pruebaoh.ohentitymodel.entidades.DetalleVenta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {VentaMapper.class, ProductoMapper.class})
public interface DetalleVentaMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "venta", target = "ventaDTO"),
            @Mapping(source = "producto", target = "productoDTO"),
            @Mapping(source = "cantidad", target = "cantidad")
    })
    DetalleVentaDTO detalleVentaToDetalleVentaDTO(DetalleVenta detalleVenta);

    List<DetalleVentaDTO> detalleVentaToDetalleVentaDTO(List<DetalleVenta> detalleVenta);

    @InheritInverseConfiguration
    DetalleVenta detalleVentaDTOToDetalleVenta(DetalleVentaDTO detalleVentaDTO);

    List<DetalleVenta> detalleVentaDTOToDetalleVenta(List<DetalleVentaDTO> detalleVentaDTO);
}

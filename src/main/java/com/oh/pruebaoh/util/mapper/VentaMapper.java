package com.oh.pruebaoh.util.mapper;

import com.oh.pruebaoh.domain.dto.VentaDTO;
import oh.pruebaoh.ohentitymodel.entidades.Venta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ClienteMapper.class})
public interface VentaMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "cliente", target = "clienteDTO"),
            @Mapping(source = "fecha", target = "fecha")
    })
    VentaDTO ventaToVentaDTO(Venta venta);

    List<VentaDTO> ventaToVentaDTO(List<Venta> venta);

    @InheritInverseConfiguration
    Venta ventaDTOToVenta(VentaDTO ventaDTO);

    List<Venta> ventaDTOToVenta(List<VentaDTO> ventaDTO);
}

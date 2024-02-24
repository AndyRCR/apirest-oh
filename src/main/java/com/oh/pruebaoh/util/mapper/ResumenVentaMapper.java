package com.oh.pruebaoh.util.mapper;

import com.oh.pruebaoh.domain.dto.ResumenVentaDTO;
import com.oh.pruebaoh.domain.dto.VentaDTO;
import oh.pruebaoh.ohentitymodel.entidades.ResumenVenta;
import oh.pruebaoh.ohentitymodel.entidades.Venta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ResumenVentaMapper {
    @Mappings({
            @Mapping(source = "cliente", target = "cliente"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "fecha", target = "fecha")
    })
    ResumenVentaDTO resumenVentaToResumenVentaDTO(ResumenVenta resumenVenta);

    List<ResumenVentaDTO> resumenVentaToResumenVentaDTO(List<ResumenVenta> resumenVenta);

    @InheritInverseConfiguration
    ResumenVenta resumenVentaDTOToResumenVenta(ResumenVentaDTO resumenVentaDTO);

    List<ResumenVenta> resumenVentaDTOToResumenVenta(List<ResumenVentaDTO> resumenVentaDTO);
}

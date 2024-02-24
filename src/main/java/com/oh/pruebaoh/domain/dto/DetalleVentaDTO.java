package com.oh.pruebaoh.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVentaDTO {
    private Long id;
    private VentaDTO ventaDTO;
    private ProductoDTO productoDTO;
    private Integer cantidad;
}

package com.oh.pruebaoh.domain.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumenVentaDTO {
    private String cliente;
    private Double total;
    private LocalDateTime fecha;
}

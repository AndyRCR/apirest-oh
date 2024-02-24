package com.oh.pruebaoh.domain.service;

import com.oh.pruebaoh.domain.dto.DetalleVentaDTO;
import com.oh.pruebaoh.domain.dto.ResumenVentaDTO;
import com.oh.pruebaoh.domain.dto.VentaDTO;
import com.oh.pruebaoh.persistence.repository.DetalleVentaRepository;
import com.oh.pruebaoh.util.mapper.DetalleVentaMapper;
import com.oh.pruebaoh.util.mapper.ResumenVentaMapper;
import oh.pruebaoh.ohentitymodel.entidades.DetalleVenta;
import oh.pruebaoh.ohentitymodel.entidades.ResumenVenta;
import oh.pruebaoh.ohentitymodel.entidades.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetalleVentaService {

    @Autowired
    DetalleVentaRepository detalleVentaRepository;

    @Autowired
    DetalleVentaMapper detalleVentaConversor;

    @Autowired
    ResumenVentaMapper resumenVentaConversor;

    @Transactional
    public List<ResumenVentaDTO> findResumenVentaByFecha(String fecha) {
        List<ResumenVenta> resumenVenta = detalleVentaRepository.findDetallesVentaByFecha(fecha);
        return resumenVentaConversor.resumenVentaToResumenVentaDTO(resumenVenta);
    }
}

package com.oh.pruebaoh.domain.service;

import com.oh.pruebaoh.domain.dto.VentaDTO;
import com.oh.pruebaoh.persistence.repository.VentaRepository;
import com.oh.pruebaoh.util.mapper.VentaMapper;
import oh.pruebaoh.ohentitymodel.entidades.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.sql.Blob;
import java.util.List;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    @Autowired
    VentaMapper ventaConversor;

    @Transactional
    public VentaDTO getVentaById(Long idVenta) {
        Venta venta = ventaRepository.getVentaById(idVenta);
        return ventaConversor.ventaToVentaDTO(venta);
    }

    @Transactional
    public List<VentaDTO> getVentasByFecha(String fecha) {
        List<Venta> venta = ventaRepository.getVentasByFecha(fecha);
        return ventaConversor.ventaToVentaDTO(venta);
    }

}

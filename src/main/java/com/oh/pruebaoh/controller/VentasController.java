package com.oh.pruebaoh.controller;

import com.oh.pruebaoh.domain.dto.DetalleVentaDTO;
import com.oh.pruebaoh.domain.dto.ResumenVentaDTO;
import com.oh.pruebaoh.domain.dto.VentaDTO;
import com.oh.pruebaoh.domain.service.ClienteService;
import com.oh.pruebaoh.domain.service.DetalleVentaService;
import com.oh.pruebaoh.domain.service.VentaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentasController {

    @Autowired
    VentaService ventaService;

    @Autowired
    DetalleVentaService detalleVentaService;

    @Operation(description = "Obtiene las ventas", tags = "Ventas")
    @GetMapping("/id/{idVenta}")
    public ResponseEntity<VentaDTO> getVentaById(@PathVariable("idVenta") Long idVenta) {
        VentaDTO venta = ventaService.getVentaById(idVenta);
        return new ResponseEntity<>(venta, HttpStatus.OK);
    }

    @Operation(description = "Obtiene las ventas por fecha", tags = "Ventas")
    @GetMapping("/fecha/{fecha}")
    public ResponseEntity<List<VentaDTO>> getVentasByFecha(@PathVariable("fecha") String fecha) {
        List<VentaDTO> venta = ventaService.getVentasByFecha(fecha);
        return new ResponseEntity<>(venta, HttpStatus.OK);
    }

    @Operation(description = "Obtiene el detalle de la venta por fecha", tags = "Ventas")
    @GetMapping("/detalleVenta/id/{fecha}")
    public ResponseEntity<List<ResumenVentaDTO>> getDetalleVentaByFecha(@PathVariable("fecha") String fecha) {
        List<ResumenVentaDTO> resumenVenta = detalleVentaService.findResumenVentaByFecha(fecha);
        return new ResponseEntity<>(resumenVenta, HttpStatus.OK);
    }
}

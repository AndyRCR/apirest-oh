package com.oh.pruebaoh.persistence.repository;

import com.oh.pruebaoh.persistence.dao.IVentaDao;
import oh.pruebaoh.ohentitymodel.entidades.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;

@Repository
public class VentaRepository {

    @Autowired
    IVentaDao iVentaDao;

    public Venta getVentaById(Long idVenta) {
        return iVentaDao.getVentasById(idVenta);
    }

    public List<Venta> getVentasByFecha(String fecha) {
        LocalDate fechaLocalDate = LocalDate.parse(fecha);
        LocalDateTime fechaLocalDateTime = fechaLocalDate.atStartOfDay();
        return iVentaDao.getVentasByFecha(fechaLocalDateTime);
    }
}

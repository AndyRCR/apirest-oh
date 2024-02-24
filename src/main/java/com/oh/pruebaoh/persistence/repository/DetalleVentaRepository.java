package com.oh.pruebaoh.persistence.repository;

import com.oh.pruebaoh.domain.dto.DetalleVentaDTO;
import com.oh.pruebaoh.domain.dto.ResumenVentaDTO;
import com.oh.pruebaoh.persistence.dao.IDetalleVentaDao;
import com.oh.pruebaoh.persistence.projections.IProducto;
import oh.pruebaoh.ohentitymodel.entidades.DetalleVenta;
import oh.pruebaoh.ohentitymodel.entidades.ResumenVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class DetalleVentaRepository {

    @Autowired
    IDetalleVentaDao iDetalleVentaDao;

    public List<ResumenVenta> findDetallesVentaByFecha(String fecha){
        LocalDate fechaLocalDate = LocalDate.parse(fecha);
        LocalDateTime fechaLocalDateTime = fechaLocalDate.atStartOfDay();
        return iDetalleVentaDao.findDetallesVentaByFecha(fechaLocalDateTime);
    }
}

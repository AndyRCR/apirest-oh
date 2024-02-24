package com.oh.pruebaoh.persistence.dao;

import oh.pruebaoh.ohentitymodel.entidades.Venta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface IVentaDao extends CrudRepository<Venta, Long> {
    @Query(value = "FROM Venta as i" +
        " WHERE i.id = :idVenta" +
        " ORDER BY i.id ")
    Venta getVentasById(@Param("idVenta") Long idVenta);

    @Query(value = "FROM Venta as i" +
            " WHERE i.fecha = :fecha" +
            " ORDER BY i.id ")
    List<Venta> getVentasByFecha(@Param("fecha") LocalDateTime fecha);
}

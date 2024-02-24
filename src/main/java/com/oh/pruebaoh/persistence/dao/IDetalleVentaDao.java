package com.oh.pruebaoh.persistence.dao;

import oh.pruebaoh.ohentitymodel.entidades.ResumenVenta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface IDetalleVentaDao extends CrudRepository<ResumenVenta, Long> {

    @Query(value = "SELECT \n" +
            "    c.nombres || ' ' || c.apellidos AS cliente,\n" +
            "    SUM(p.precio * dv.cantidad) AS total,\n" +
            "    v.fecha as fecha\n" +
            "FROM \n" +
            "    venta v\n" +
            "JOIN \n" +
            "    cliente c ON v.id_cliente = c.id\n" +
            "JOIN \n" +
            "    detalle_venta dv ON v.id = dv.id_venta\n" +
            "JOIN \n" +
            "    producto p ON dv.id_producto = p.id\n" +
            "WHERE\n" +
            "    v.fecha = :fecha\n" +
            "GROUP BY \n" +
            "    v.id, c.nombres, c.apellidos, v.fecha", nativeQuery = true )
    List<ResumenVenta> findDetallesVentaByFecha(@Param("fecha") LocalDateTime fecha);
}

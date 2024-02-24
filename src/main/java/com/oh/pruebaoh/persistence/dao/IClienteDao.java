package com.oh.pruebaoh.persistence.dao;

import oh.pruebaoh.ohentitymodel.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}

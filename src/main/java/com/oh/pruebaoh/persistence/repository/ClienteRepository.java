package com.oh.pruebaoh.persistence.repository;

import com.oh.pruebaoh.persistence.dao.IClienteDao;
import oh.pruebaoh.ohentitymodel.entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository {

    @Autowired
    IClienteDao dao;

    public List<Cliente> getClientes(){
        return (List<Cliente>) dao.findAll();
    }

    public Cliente saveCliente(Cliente cliente){
        return dao.save(cliente);
    }
}

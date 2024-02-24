package com.oh.pruebaoh.domain.service;

import com.oh.pruebaoh.domain.dto.ClienteDTO;
import com.oh.pruebaoh.persistence.repository.ClienteRepository;
import com.oh.pruebaoh.util.mapper.ClienteMapper;
import oh.pruebaoh.ohentitymodel.entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ClienteMapper clienteConversor;

    public List<ClienteDTO> getAllClientes(){
        List<Cliente> listaClientes = clienteRepository.getClientes();
        return clienteConversor.clienteToClienteDTO(listaClientes);
    }

    public void saveCliente(ClienteDTO clienteDTO) {
        Cliente cliente = clienteConversor.clienteDTOToCliente(clienteDTO);
        clienteRepository.saveCliente(cliente);
    }
}

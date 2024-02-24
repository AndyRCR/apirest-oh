package com.oh.pruebaoh.util.mapper;

import com.oh.pruebaoh.domain.dto.ClienteDTO;
import oh.pruebaoh.ohentitymodel.entidades.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "apellidos", target = "apellidos"),
            @Mapping(source = "dni", target = "dni"),
            @Mapping(source = "telefono", target = "telefono"),
            @Mapping(source = "email", target = "email")
    })
    ClienteDTO clienteToClienteDTO(Cliente cliente);

    List<ClienteDTO> clienteToClienteDTO(List<Cliente> cliente);

    @InheritInverseConfiguration
    Cliente clienteDTOToCliente(ClienteDTO clienteDTO);

    List<Cliente> clienteDTOToCliente(List<ClienteDTO> clienteDTO);
}

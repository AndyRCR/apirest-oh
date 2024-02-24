package com.oh.pruebaoh.controller;

import com.oh.pruebaoh.domain.dto.ClienteDTO;
import com.oh.pruebaoh.domain.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Operation(description = "Obtiene las ventas", tags = "Ventas")
    @GetMapping("/")
    public ResponseEntity<List<ClienteDTO>> getClientes(){
        List<ClienteDTO> listaClientes = clienteService.getAllClientes();
        return new ResponseEntity<>(listaClientes, HttpStatus.OK);
    }

    @Operation(description = "Registrar clientes", summary = "Registro Cliente")
    @PostMapping("/savecliente")
    public ResponseEntity<Object> saveCliente(@RequestBody ClienteDTO cliente) {
        clienteService.saveCliente(cliente);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}

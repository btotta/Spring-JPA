package com.example.demo.controllers;

import com.example.demo.business.Interface.ClienteBO;
import com.example.demo.entity.ClienteTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteBO clienteBO;


    @GetMapping
    public ResponseEntity<List<ClienteTO>> getAll() {

        List<ClienteTO> list = clienteBO.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteTO> getById(@PathVariable("id") Long id) {
        ClienteTO cliente = clienteBO.getById(id).orElse(null);
        if (cliente == null) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(cliente);
    }

    @PostMapping
    public ResponseEntity<ClienteTO> create(@RequestBody ClienteTO cliente) {
        ClienteTO newCliente = clienteBO.save(cliente);
        if (newCliente == null) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(newCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        ClienteTO cliente = clienteBO.getById(id).orElse(null);
        if (cliente == null) {
            return ResponseEntity.noContent().build();
        }
        clienteBO.delete(id);

        return ResponseEntity.ok().build();
    }


}

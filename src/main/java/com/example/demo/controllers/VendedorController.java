package com.example.demo.controllers;

import com.example.demo.business.Interface.VendedorBO;
import com.example.demo.entity.VendedorTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {


    @Autowired
    private VendedorBO vendedorBO;

    @GetMapping
    public ResponseEntity<List<VendedorTO>> getall() {
        List<VendedorTO> list = vendedorBO.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendedorTO> getById(@PathVariable("id") Long id) {
        VendedorTO vendedor = vendedorBO.getById(id).orElse(null);
        if (vendedor == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(vendedor);
    }

    @PostMapping
    public ResponseEntity<VendedorTO> save(@RequestBody VendedorTO vendedor) {
        VendedorTO vend = vendedorBO.save(vendedor);
        if (vend == null)
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok().body(vend);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        VendedorTO vendedor = vendedorBO.getById(id).orElse(null);
        if (vendedor == null) {
            return ResponseEntity.noContent().build();
        }
        vendedorBO.delete(id);

        return ResponseEntity.noContent().build();
    }


}

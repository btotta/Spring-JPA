package com.example.demo.controllers;

import com.example.demo.business.Interface.ProdutoBO;
import com.example.demo.entity.ProdutoTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoBO produtoBO;

    @GetMapping
    public ResponseEntity<List<ProdutoTO>> getAll() {
        List<ProdutoTO> list = produtoBO.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoTO> getById(@PathVariable("id") Long id) {
        ProdutoTO produto = produtoBO.getById(id).orElse(null);
        if (produto == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(produto);
    }

    @PostMapping
    public ResponseEntity<ProdutoTO> save(@RequestBody ProdutoTO produto) {
        ProdutoTO prod = produtoBO.save(produto);
        if (prod == null)
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok().body(prod);
    }

    @DeleteMapping("/id")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        ProdutoTO produto = produtoBO.getById(id).orElse(null);
        if (produto == null) {
            return ResponseEntity.noContent().build();
        }
        produtoBO.delete(id);

        return ResponseEntity.noContent().build();
    }


}

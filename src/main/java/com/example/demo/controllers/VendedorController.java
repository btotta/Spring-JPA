package com.example.demo.controllers;

import com.example.demo.business.Interface.VendedorBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {


    @Autowired
    private VendedorBO vendedorBO;
}

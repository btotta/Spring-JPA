package com.example.demo.business;

import com.example.demo.business.Interface.VendedorBO;
import com.example.demo.entity.VendedorTO;
import com.example.demo.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorBOImpl implements VendedorBO {


    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public List<VendedorTO> getAll() {
        return vendedorRepository.findAll();
    }

    @Override
    public Optional<VendedorTO> getById(Long id) {
        return vendedorRepository.findById(id);
    }

    @Override
    public VendedorTO save(VendedorTO produto) {
        return vendedorRepository.save(produto);
    }

    @Override
    public void delete(Long id) {
        vendedorRepository.deleteById(id);
    }
}

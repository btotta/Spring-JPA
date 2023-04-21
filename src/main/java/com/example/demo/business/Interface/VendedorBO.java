package com.example.demo.business.Interface;

import com.example.demo.entity.VendedorTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VendedorBO {

    List<VendedorTO> getAll();

    Optional<VendedorTO> getById(Long id);

    VendedorTO save(VendedorTO produto);

    void delete(Long id);
}

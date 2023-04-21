package com.example.demo.business.Interface;

import com.example.demo.entity.ProdutoTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProdutoBO {

    List<ProdutoTO> getAll();

    Optional<ProdutoTO> getById(Long id);

    ProdutoTO save(ProdutoTO produto);

    void delete(Long id);

}
